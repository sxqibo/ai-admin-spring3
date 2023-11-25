package com.sxqibo.spring3admin.resp;

public class EbookResp {
    private Integer id;

    private String name;

    private String description;

    private Integer category1_id;

    private Integer category2_id;

    private String cover;

    private Integer doc_count;

    private Integer vote_count;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getCategory1_id() {
        return category1_id;
    }

    public void setCategory1Id(Integer category1_id) {
        this.category1_id = category1_id;
    }

    public Integer getCategory2_id() {
        return category2_id;
    }

    public void setCategory2Id(Integer category2_id) {
        this.category2_id = category2_id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getDoc_count() {
        return doc_count;
    }

    public void setDocCount(Integer doc_count) {
        this.doc_count = doc_count;
    }

    public Integer getVote_count() {
        return vote_count;
    }

    public void setVoteCount(Integer vote_count) {
        this.vote_count = vote_count;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", cover=").append(description);
        sb.append(", doc_count=").append(description);
        sb.append(", vote_count=").append(description);
        sb.append("]");
        return sb.toString();
    }
}