package fauzi.hilmy.ufcfighter.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class ResponseFighter implements Parcelable {

	@SerializedName("wins")
	private int wins;

	@SerializedName("statid")
	private int statid;

	@SerializedName("thumbnail")
	private String thumbnail;

	@SerializedName("belt_thumbnail")
	private String beltThumbnail;

	@SerializedName("pound_for_pound_rank")
	private String poundForPoundRank;

	@SerializedName("link")
	private String link;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("losses")
	private int losses;

	@SerializedName("title_holder")
	private boolean titleHolder;

	@SerializedName("profile_image")
	private String profileImage;

	@SerializedName("weight_class")
	private String weightClass;

	@SerializedName("left_full_body_image")
	private String leftFullBodyImage;

	@SerializedName("nickname")
	private Object nickname;

	@SerializedName("draws")
	private int draws;

	@SerializedName("rank")
	private String rank;

	@SerializedName("right_full_body_image")
	private String rightFullBodyImage;

	@SerializedName("id")
	private int id;

	@SerializedName("fighter_status")
	private String fighterStatus;

	@SerializedName("first_name")
	private String firstName;

	protected ResponseFighter(Parcel in) {
		wins = in.readInt();
		statid = in.readInt();
		thumbnail = in.readString();
		beltThumbnail = in.readString();
		poundForPoundRank = in.readString();
		link = in.readString();
		lastName = in.readString();
		losses = in.readInt();
		titleHolder = in.readByte() != 0;
		profileImage = in.readString();
		weightClass = in.readString();
		leftFullBodyImage = in.readString();
		draws = in.readInt();
		rank = in.readString();
		rightFullBodyImage = in.readString();
		id = in.readInt();
		fighterStatus = in.readString();
		firstName = in.readString();
	}

	public static final Creator<ResponseFighter> CREATOR = new Creator<ResponseFighter>() {
		@Override
		public ResponseFighter createFromParcel(Parcel in) {
			return new ResponseFighter(in);
		}

		@Override
		public ResponseFighter[] newArray(int size) {
			return new ResponseFighter[size];
		}
	};

	public void setWins(int wins){
		this.wins = wins;
	}

	public int getWins(){
		return wins;
	}

	public void setStatid(int statid){
		this.statid = statid;
	}

	public int getStatid(){
		return statid;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public void setBeltThumbnail(String beltThumbnail){
		this.beltThumbnail = beltThumbnail;
	}

	public String getBeltThumbnail(){
		return beltThumbnail;
	}

	public void setPoundForPoundRank(String poundForPoundRank){
		this.poundForPoundRank = poundForPoundRank;
	}

	public String getPoundForPoundRank(){
		return poundForPoundRank;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLosses(int losses){
		this.losses = losses;
	}

	public int getLosses(){
		return losses;
	}

	public void setTitleHolder(boolean titleHolder){
		this.titleHolder = titleHolder;
	}

	public boolean isTitleHolder(){
		return titleHolder;
	}

	public void setProfileImage(String profileImage){
		this.profileImage = profileImage;
	}

	public String getProfileImage(){
		return profileImage;
	}

	public void setWeightClass(String weightClass){
		this.weightClass = weightClass;
	}

	public String getWeightClass(){
		return weightClass;
	}

	public void setLeftFullBodyImage(String leftFullBodyImage){
		this.leftFullBodyImage = leftFullBodyImage;
	}

	public String getLeftFullBodyImage(){
		return leftFullBodyImage;
	}

	public void setNickname(Object nickname){
		this.nickname = nickname;
	}

	public Object getNickname(){
		return nickname;
	}

	public void setDraws(int draws){
		this.draws = draws;
	}

	public int getDraws(){
		return draws;
	}

	public void setRank(String rank){
		this.rank = rank;
	}

	public String getRank(){
		return rank;
	}

	public void setRightFullBodyImage(String rightFullBodyImage){
		this.rightFullBodyImage = rightFullBodyImage;
	}

	public String getRightFullBodyImage(){
		return rightFullBodyImage;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setFighterStatus(String fighterStatus){
		this.fighterStatus = fighterStatus;
	}

	public String getFighterStatus(){
		return fighterStatus;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	@Override
 	public String toString(){
		return 
			"ResponseFighter{" + 
			"wins = '" + wins + '\'' + 
			",statid = '" + statid + '\'' + 
			",thumbnail = '" + thumbnail + '\'' + 
			",belt_thumbnail = '" + beltThumbnail + '\'' + 
			",pound_for_pound_rank = '" + poundForPoundRank + '\'' + 
			",link = '" + link + '\'' + 
			",last_name = '" + lastName + '\'' + 
			",losses = '" + losses + '\'' + 
			",title_holder = '" + titleHolder + '\'' + 
			",profile_image = '" + profileImage + '\'' + 
			",weight_class = '" + weightClass + '\'' + 
			",left_full_body_image = '" + leftFullBodyImage + '\'' + 
			",nickname = '" + nickname + '\'' + 
			",draws = '" + draws + '\'' + 
			",rank = '" + rank + '\'' + 
			",right_full_body_image = '" + rightFullBodyImage + '\'' + 
			",id = '" + id + '\'' + 
			",fighter_status = '" + fighterStatus + '\'' + 
			",first_name = '" + firstName + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeInt(wins);
		parcel.writeInt(statid);
		parcel.writeString(thumbnail);
		parcel.writeString(beltThumbnail);
		parcel.writeString(poundForPoundRank);
		parcel.writeString(link);
		parcel.writeString(lastName);
		parcel.writeInt(losses);
		parcel.writeByte((byte) (titleHolder ? 1 : 0));
		parcel.writeString(profileImage);
		parcel.writeString(weightClass);
		parcel.writeString(leftFullBodyImage);
		parcel.writeInt(draws);
		parcel.writeString(rank);
		parcel.writeString(rightFullBodyImage);
		parcel.writeInt(id);
		parcel.writeString(fighterStatus);
		parcel.writeString(firstName);
	}
}