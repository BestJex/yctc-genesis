package edu.yctc.project.system.score.domain;

import edu.yctc.framework.aspectj.lang.annotation.Excel;
import edu.yctc.framework.web.domain.BaseEntity;
import edu.yctc.project.system.course.domain.Course;
import edu.yctc.project.system.lesson.domain.Lesson;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 学生上课评分汇总对象 sys_class_score
 * 
 * @author yctc
 * @date 2020-04-16
 */
public class ClassScore extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 用户编号 */
    @Excel(name = "用户编号")
    private Long userId;

    /** 课时编号 */
    @Excel(name = "课时编号")
    private Long lessonId;

    /** 课程评分 */
    @Excel(name = "课程评分")
    private Double score;

    private Lesson lesson;

	public Lesson getLesson() {
		if (lesson == null)
		{
			lesson = new Lesson();
		}
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	/** 修改时间 */
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifyTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setLessonId(Long lessonId) 
    {
        this.lessonId = lessonId;
    }

    public Long getLessonId() 
    {
        return lessonId;
    }
    public void setScore(Double score) 
    {
        this.score = score;
    }

    public Double getScore() 
    {
        return score;
    }
    public void setModifyTime(Date modifyTime) 
    {
        this.modifyTime = modifyTime;
    }

    public Date getModifyTime() 
    {
        return modifyTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("lessonId", getLessonId())
            .append("score", getScore())
            .append("createTime", getCreateTime())
            .append("modifyTime", getModifyTime())
            .toString();
    }
}
