//package com.onlineTaskMgm.onlineTaskMgm.Entiyt;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.ForeignKey;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "Tasks")
//
//public class TasksEntity {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_user"))
//	private User user;
//
//	@Column(nullable = false, length = 100)
//	private String title;
//
//	@Column(columnDefinition = "TEXT")
//	private String description;
//
//	@Column(nullable = false, length = 10)
//	private String priority;
//
//	@Column(nullable = false, length = 20)
//	private String category;
//
//	@Column(name = "due_date")
//	private LocalDate dueDate;
//
//	@Column(nullable = false, length = 10)
//	private String status = "pending";
//
//	@Column(name = "created_at", nullable = false, updatable = false)
//	private LocalDateTime createdAt = LocalDateTime.now();
//
//	@Column(name = "updated_at", nullable = false)
//	private LocalDateTime updatedAt = LocalDateTime.now();
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public String getPriority() {
//		return priority;
//	}
//
//	public void setPriority(String priority) {
//		this.priority = priority;
//	}
//
//	public String getCategory() {
//		return category;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}
//
//	public LocalDate getDueDate() {
//		return dueDate;
//	}
//
//	public void setDueDate(LocalDate dueDate) {
//		this.dueDate = dueDate;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
//	public LocalDateTime getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(LocalDateTime createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	public LocalDateTime getUpdatedAt() {
//		return updatedAt;
//	}
//
//	public void setUpdatedAt(LocalDateTime updatedAt) {
//		this.updatedAt = updatedAt;
//	}
//
//}
