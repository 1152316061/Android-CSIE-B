package org.example.Android.pojo;

public class Medicine {

    private String UID;
    private String mName;
    private String dosage;
    private String time;

    public Medicine(String UID, String mName, String dosage, String time) {
        this.UID = UID;
        this.mName = mName;
        this.dosage = dosage;
        this.time = time;
    }

    public Medicine() {}

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "UID='" + UID + '\'' +
                ", mName='" + mName + '\'' +
                ", dosage='" + dosage + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
