package com.pinterest.activity.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import br.b;
import java.io.Serializable;
import oi.e7;

/* loaded from: classes3.dex */
public class RelatedQueryItem implements Comparable, Serializable, Parcelable {
    public static final Parcelable.Creator<RelatedQueryItem> CREATOR = new e7(24);

    /* renamed from: a, reason: collision with root package name */
    public String f35122a;

    /* renamed from: b, reason: collision with root package name */
    public String f35123b;

    /* renamed from: c, reason: collision with root package name */
    public String f35124c;

    /* renamed from: d, reason: collision with root package name */
    public b f35125d;

    /* renamed from: e, reason: collision with root package name */
    public String f35126e;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        String str;
        if (!(obj instanceof RelatedQueryItem)) {
            return 0;
        }
        RelatedQueryItem relatedQueryItem = (RelatedQueryItem) obj;
        String str2 = this.f35122a;
        if (str2 == null || (str = relatedQueryItem.f35122a) == null) {
            return 0;
        }
        return str2.compareTo(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedQueryItem)) {
            return false;
        }
        RelatedQueryItem relatedQueryItem = (RelatedQueryItem) obj;
        if (this.f35125d != relatedQueryItem.f35125d) {
            return false;
        }
        String str = this.f35123b;
        if (str == null ? relatedQueryItem.f35123b != null : !str.equals(relatedQueryItem.f35123b)) {
            return false;
        }
        String str2 = this.f35124c;
        if (str2 == null ? relatedQueryItem.f35124c != null : !str2.equals(relatedQueryItem.f35124c)) {
            return false;
        }
        String str3 = this.f35122a;
        if (str3 == null ? relatedQueryItem.f35122a != null : !str3.equals(relatedQueryItem.f35122a)) {
            return false;
        }
        String str4 = this.f35126e;
        return str4 != null ? str4.equals(relatedQueryItem.f35126e) : relatedQueryItem.f35126e == null;
    }

    public final int hashCode() {
        b bVar = this.f35125d;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        String str = this.f35123b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35124c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f35122a;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f35126e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return this.f35122a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f35122a);
        parcel.writeString(this.f35123b);
        parcel.writeString(this.f35124c);
        parcel.writeString(this.f35125d.name());
        parcel.writeString(this.f35126e);
    }
}
