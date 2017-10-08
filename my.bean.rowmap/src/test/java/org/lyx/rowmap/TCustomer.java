package org.lyx.rowmap;
// default package

import java.util.Date;


/**
 * TCustomer entity. @author MyEclipse Persistence Tools
 */

public class TCustomer  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 2904233475623660400L;
	// Fields    

     private Integer customerId;
     private Integer accountId;
     private String orgId;
     private String provinceCustomerId;
     private Integer HId;
     private String name;
     private String address;
     private String telAreaCode;
     private String tel;
     private String email;
     private String serviceTelArea;
     private String serviceTel;
     private String areaId;
     private String zipcode;
     private Short industryId;
     private String industryName;
     private String businessNumber;
     private Date licenseValidity;
     private String licensePic;
     private String website;
     private String introduction;
     private Double gisX;
     private Double gisY;
     private String trafficline;
     private String linkmanName;
     private String linkmanSex;
     private String linkmanEmail;
     private String linkmanTelAreaCode;
     private String linkmanTel;
     private String linkmanMobil;
     private String linkmanIdFrontpic;
     private String linkmanIdBackpic;
     private Integer channel;
     private Integer type;
     private Integer dataFrom;
     private String status;
     private String levelId;
     private Integer parentId;
     private String custSource;
     private String areaName;
     private String conversion;
     private String entId;
     private String null5;
     private String null6;
     private String null7;
     private String null8;
     private String null9;
     private Integer creator;
     private Date createTime;
     private Integer updator;
     private Date updateTime;


    // Constructors

    /** default constructor */
    public TCustomer() {
    }

    
    /** full constructor */
    public TCustomer(Integer accountId, String orgId, String provinceCustomerId, Integer HId, String name, String address, String telAreaCode, String tel, String email, String serviceTelArea, String serviceTel, String areaId, String zipcode, Short industryId, String industryName, String businessNumber, Date licenseValidity, String licensePic, String website, String introduction, Double gisX, Double gisY, String trafficline, String linkmanName, String linkmanSex, String linkmanEmail, String linkmanTelAreaCode, String linkmanTel, String linkmanMobil, String linkmanIdFrontpic, String linkmanIdBackpic, Integer channel, Integer type, Integer dataFrom, String status, String levelId, Integer parentId, String custSource, String areaName, String conversion, String entId, String null5, String null6, String null7, String null8, String null9, Integer creator, Date createTime, Integer updator, Date updateTime) {
        this.accountId = accountId;
        this.orgId = orgId;
        this.provinceCustomerId = provinceCustomerId;
        this.HId = HId;
        this.name = name;
        this.address = address;
        this.telAreaCode = telAreaCode;
        this.tel = tel;
        this.email = email;
        this.serviceTelArea = serviceTelArea;
        this.serviceTel = serviceTel;
        this.areaId = areaId;
        this.zipcode = zipcode;
        this.industryId = industryId;
        this.industryName = industryName;
        this.businessNumber = businessNumber;
        this.licenseValidity = licenseValidity;
        this.licensePic = licensePic;
        this.website = website;
        this.introduction = introduction;
        this.gisX = gisX;
        this.gisY = gisY;
        this.trafficline = trafficline;
        this.linkmanName = linkmanName;
        this.linkmanSex = linkmanSex;
        this.linkmanEmail = linkmanEmail;
        this.linkmanTelAreaCode = linkmanTelAreaCode;
        this.linkmanTel = linkmanTel;
        this.linkmanMobil = linkmanMobil;
        this.linkmanIdFrontpic = linkmanIdFrontpic;
        this.linkmanIdBackpic = linkmanIdBackpic;
        this.channel = channel;
        this.type = type;
        this.dataFrom = dataFrom;
        this.status = status;
        this.levelId = levelId;
        this.parentId = parentId;
        this.custSource = custSource;
        this.areaName = areaName;
        this.conversion = conversion;
        this.entId = entId;
        this.null5 = null5;
        this.null6 = null6;
        this.null7 = null7;
        this.null8 = null8;
        this.null9 = null9;
        this.creator = creator;
        this.createTime = createTime;
        this.updator = updator;
        this.updateTime = updateTime;
    }

   
    // Property accessors

    public Integer getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getOrgId() {
        return this.orgId;
    }
    
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getProvinceCustomerId() {
        return this.provinceCustomerId;
    }
    
    public void setProvinceCustomerId(String provinceCustomerId) {
        this.provinceCustomerId = provinceCustomerId;
    }

    public Integer getHId() {
        return this.HId;
    }
    
    public void setHId(Integer HId) {
        this.HId = HId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelAreaCode() {
        return this.telAreaCode;
    }
    
    public void setTelAreaCode(String telAreaCode) {
        this.telAreaCode = telAreaCode;
    }

    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getServiceTelArea() {
        return this.serviceTelArea;
    }
    
    public void setServiceTelArea(String serviceTelArea) {
        this.serviceTelArea = serviceTelArea;
    }

    public String getServiceTel() {
        return this.serviceTel;
    }
    
    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel;
    }

    public String getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getZipcode() {
        return this.zipcode;
    }
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Short getIndustryId() {
        return this.industryId;
    }
    
    public void setIndustryId(Short industryId) {
        this.industryId = industryId;
    }

    public String getIndustryName() {
        return this.industryName;
    }
    
    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getBusinessNumber() {
        return this.businessNumber;
    }
    
    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public Date getLicenseValidity() {
        return this.licenseValidity;
    }
    
    public void setLicenseValidity(Date licenseValidity) {
        this.licenseValidity = licenseValidity;
    }

    public String getLicensePic() {
        return this.licensePic;
    }
    
    public void setLicensePic(String licensePic) {
        this.licensePic = licensePic;
    }

    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIntroduction() {
        return this.introduction;
    }
    
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Double getGisX() {
        return this.gisX;
    }
    
    public void setGisX(Double gisX) {
        this.gisX = gisX;
    }

    public Double getGisY() {
        return this.gisY;
    }
    
    public void setGisY(Double gisY) {
        this.gisY = gisY;
    }

    public String getTrafficline() {
        return this.trafficline;
    }
    
    public void setTrafficline(String trafficline) {
        this.trafficline = trafficline;
    }

    public String getLinkmanName() {
        return this.linkmanName;
    }
    
    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    public String getLinkmanSex() {
        return this.linkmanSex;
    }
    
    public void setLinkmanSex(String linkmanSex) {
        this.linkmanSex = linkmanSex;
    }

    public String getLinkmanEmail() {
        return this.linkmanEmail;
    }
    
    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail;
    }

    public String getLinkmanTelAreaCode() {
        return this.linkmanTelAreaCode;
    }
    
    public void setLinkmanTelAreaCode(String linkmanTelAreaCode) {
        this.linkmanTelAreaCode = linkmanTelAreaCode;
    }

    public String getLinkmanTel() {
        return this.linkmanTel;
    }
    
    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel;
    }

    public String getLinkmanMobil() {
        return this.linkmanMobil;
    }
    
    public void setLinkmanMobil(String linkmanMobil) {
        this.linkmanMobil = linkmanMobil;
    }

    public String getLinkmanIdFrontpic() {
        return this.linkmanIdFrontpic;
    }
    
    public void setLinkmanIdFrontpic(String linkmanIdFrontpic) {
        this.linkmanIdFrontpic = linkmanIdFrontpic;
    }

    public String getLinkmanIdBackpic() {
        return this.linkmanIdBackpic;
    }
    
    public void setLinkmanIdBackpic(String linkmanIdBackpic) {
        this.linkmanIdBackpic = linkmanIdBackpic;
    }

    public Integer getChannel() {
        return this.channel;
    }
    
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getType() {
        return this.type;
    }
    
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDataFrom() {
        return this.dataFrom;
    }
    
    public void setDataFrom(Integer dataFrom) {
        this.dataFrom = dataFrom;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevelId() {
        return this.levelId;
    }
    
    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCustSource() {
        return this.custSource;
    }
    
    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

    public String getConversion() {
		return conversion;
	}


	public void setConversion(String conversion) {
		this.conversion = conversion;
	}


	public String getEntId() {
        return this.entId;
    }
    
    public void setEntId(String entId) {
        this.entId = entId;
    }

    public String getNull5() {
        return this.null5;
    }
    
    public void setNull5(String null5) {
        this.null5 = null5;
    }

    public String getNull6() {
        return this.null6;
    }
    
    public void setNull6(String null6) {
        this.null6 = null6;
    }

    public String getNull7() {
        return this.null7;
    }
    
    public void setNull7(String null7) {
        this.null7 = null7;
    }

    public String getNull8() {
        return this.null8;
    }
    
    public void setNull8(String null8) {
        this.null8 = null8;
    }

    public String getNull9() {
        return this.null9;
    }
    
    public void setNull9(String null9) {
        this.null9 = null9;
    }

    public Integer getCreator() {
        return this.creator;
    }
    
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdator() {
        return this.updator;
    }
    
    public void setUpdator(Integer updator) {
        this.updator = updator;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}