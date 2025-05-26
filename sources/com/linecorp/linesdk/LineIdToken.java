package com.linecorp.linesdk;

import a.cb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.List;
import kh2.b0;
import oi.e7;

/* loaded from: classes3.dex */
public class LineIdToken implements Parcelable {
    public static final Parcelable.Creator<LineIdToken> CREATOR = new e7(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f34035a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34036b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34037c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34038d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f34039e;

    /* renamed from: f, reason: collision with root package name */
    public final Date f34040f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f34041g;

    /* renamed from: h, reason: collision with root package name */
    public final String f34042h;

    /* renamed from: i, reason: collision with root package name */
    public final List f34043i;

    /* renamed from: j, reason: collision with root package name */
    public final String f34044j;

    /* renamed from: k, reason: collision with root package name */
    public final String f34045k;

    /* renamed from: l, reason: collision with root package name */
    public final String f34046l;

    /* renamed from: m, reason: collision with root package name */
    public final String f34047m;

    /* renamed from: n, reason: collision with root package name */
    public final String f34048n;

    /* renamed from: o, reason: collision with root package name */
    public final String f34049o;

    /* renamed from: p, reason: collision with root package name */
    public final Address f34050p;

    /* renamed from: q, reason: collision with root package name */
    public final String f34051q;

    /* renamed from: r, reason: collision with root package name */
    public final String f34052r;

    /* renamed from: s, reason: collision with root package name */
    public final String f34053s;

    /* renamed from: t, reason: collision with root package name */
    public final String f34054t;

    /* renamed from: u, reason: collision with root package name */
    public final String f34055u;

    public LineIdToken(c cVar) {
        this.f34035a = cVar.f34116a;
        this.f34036b = cVar.f34117b;
        this.f34037c = cVar.f34118c;
        this.f34038d = cVar.f34119d;
        this.f34039e = cVar.f34120e;
        this.f34040f = cVar.f34121f;
        this.f34041g = cVar.f34122g;
        this.f34042h = cVar.f34123h;
        this.f34043i = cVar.f34124i;
        this.f34044j = cVar.f34125j;
        this.f34045k = cVar.f34126k;
        this.f34046l = cVar.f34127l;
        this.f34047m = cVar.f34128m;
        this.f34048n = cVar.f34129n;
        this.f34049o = cVar.f34130o;
        this.f34050p = cVar.f34131p;
        this.f34051q = cVar.f34132q;
        this.f34052r = cVar.f34133r;
        this.f34053s = cVar.f34134s;
        this.f34054t = cVar.f34135t;
        this.f34055u = cVar.f34136u;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineIdToken lineIdToken = (LineIdToken) obj;
        if (!this.f34035a.equals(lineIdToken.f34035a) || !this.f34036b.equals(lineIdToken.f34036b) || !this.f34037c.equals(lineIdToken.f34037c) || !this.f34038d.equals(lineIdToken.f34038d) || !this.f34039e.equals(lineIdToken.f34039e) || !this.f34040f.equals(lineIdToken.f34040f)) {
            return false;
        }
        Date date = lineIdToken.f34041g;
        Date date2 = this.f34041g;
        if (date2 == null ? date != null : !date2.equals(date)) {
            return false;
        }
        String str = lineIdToken.f34042h;
        String str2 = this.f34042h;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list = lineIdToken.f34043i;
        List list2 = this.f34043i;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        String str3 = lineIdToken.f34044j;
        String str4 = this.f34044j;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = lineIdToken.f34045k;
        String str6 = this.f34045k;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = lineIdToken.f34046l;
        String str8 = this.f34046l;
        if (str8 == null ? str7 != null : !str8.equals(str7)) {
            return false;
        }
        String str9 = lineIdToken.f34047m;
        String str10 = this.f34047m;
        if (str10 == null ? str9 != null : !str10.equals(str9)) {
            return false;
        }
        String str11 = lineIdToken.f34048n;
        String str12 = this.f34048n;
        if (str12 == null ? str11 != null : !str12.equals(str11)) {
            return false;
        }
        String str13 = lineIdToken.f34049o;
        String str14 = this.f34049o;
        if (str14 == null ? str13 != null : !str14.equals(str13)) {
            return false;
        }
        Address address = lineIdToken.f34050p;
        Address address2 = this.f34050p;
        if (address2 == null ? address != null : !address2.equals(address)) {
            return false;
        }
        String str15 = lineIdToken.f34051q;
        String str16 = this.f34051q;
        if (str16 == null ? str15 != null : !str16.equals(str15)) {
            return false;
        }
        String str17 = lineIdToken.f34052r;
        String str18 = this.f34052r;
        if (str18 == null ? str17 != null : !str18.equals(str17)) {
            return false;
        }
        String str19 = lineIdToken.f34053s;
        String str20 = this.f34053s;
        if (str20 == null ? str19 != null : !str20.equals(str19)) {
            return false;
        }
        String str21 = lineIdToken.f34054t;
        String str22 = this.f34054t;
        if (str22 == null ? str21 != null : !str22.equals(str21)) {
            return false;
        }
        String str23 = lineIdToken.f34055u;
        String str24 = this.f34055u;
        return str24 != null ? str24.equals(str23) : str23 == null;
    }

    public final int hashCode() {
        int hashCode = (this.f34040f.hashCode() + ((this.f34039e.hashCode() + cb.d(this.f34038d, cb.d(this.f34037c, cb.d(this.f34036b, this.f34035a.hashCode() * 31, 31), 31), 31)) * 31)) * 31;
        Date date = this.f34041g;
        int hashCode2 = (hashCode + (date != null ? date.hashCode() : 0)) * 31;
        String str = this.f34042h;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f34043i;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f34044j;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f34045k;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f34046l;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f34047m;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f34048n;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f34049o;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Address address = this.f34050p;
        int hashCode11 = (hashCode10 + (address != null ? address.hashCode() : 0)) * 31;
        String str8 = this.f34051q;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f34052r;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f34053s;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f34054t;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f34055u;
        return hashCode15 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LineIdToken{rawString='");
        sb3.append(this.f34035a);
        sb3.append("', issuer='");
        sb3.append(this.f34036b);
        sb3.append("', subject='");
        sb3.append(this.f34037c);
        sb3.append("', audience='");
        sb3.append(this.f34038d);
        sb3.append("', expiresAt=");
        sb3.append(this.f34039e);
        sb3.append(", issuedAt=");
        sb3.append(this.f34040f);
        sb3.append(", authTime=");
        sb3.append(this.f34041g);
        sb3.append(", nonce='");
        sb3.append(this.f34042h);
        sb3.append("', amr=");
        sb3.append(this.f34043i);
        sb3.append(", name='");
        sb3.append(this.f34044j);
        sb3.append("', picture='");
        sb3.append(this.f34045k);
        sb3.append("', phoneNumber='");
        sb3.append(this.f34046l);
        sb3.append("', email='");
        sb3.append(this.f34047m);
        sb3.append("', gender='");
        sb3.append(this.f34048n);
        sb3.append("', birthdate='");
        sb3.append(this.f34049o);
        sb3.append("', address=");
        sb3.append(this.f34050p);
        sb3.append(", givenName='");
        sb3.append(this.f34051q);
        sb3.append("', givenNamePronunciation='");
        sb3.append(this.f34052r);
        sb3.append("', middleName='");
        sb3.append(this.f34053s);
        sb3.append("', familyName='");
        sb3.append(this.f34054t);
        sb3.append("', familyNamePronunciation='");
        return a.a.p(sb3, this.f34055u, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f34035a);
        parcel.writeString(this.f34036b);
        parcel.writeString(this.f34037c);
        parcel.writeString(this.f34038d);
        Date date = this.f34039e;
        parcel.writeLong(date != null ? date.getTime() : -1L);
        Date date2 = this.f34040f;
        parcel.writeLong(date2 != null ? date2.getTime() : -1L);
        Date date3 = this.f34041g;
        parcel.writeLong(date3 != null ? date3.getTime() : -1L);
        parcel.writeString(this.f34042h);
        parcel.writeStringList(this.f34043i);
        parcel.writeString(this.f34044j);
        parcel.writeString(this.f34045k);
        parcel.writeString(this.f34046l);
        parcel.writeString(this.f34047m);
        parcel.writeString(this.f34048n);
        parcel.writeString(this.f34049o);
        parcel.writeParcelable(this.f34050p, i13);
        parcel.writeString(this.f34051q);
        parcel.writeString(this.f34052r);
        parcel.writeString(this.f34053s);
        parcel.writeString(this.f34054t);
        parcel.writeString(this.f34055u);
    }

    public static class Address implements Parcelable {
        public static final Parcelable.Creator<Address> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f34056a;

        /* renamed from: b, reason: collision with root package name */
        public final String f34057b;

        /* renamed from: c, reason: collision with root package name */
        public final String f34058c;

        /* renamed from: d, reason: collision with root package name */
        public final String f34059d;

        /* renamed from: e, reason: collision with root package name */
        public final String f34060e;

        public Address(b bVar) {
            this.f34056a = bVar.f34111a;
            this.f34057b = bVar.f34112b;
            this.f34058c = bVar.f34113c;
            this.f34059d = bVar.f34114d;
            this.f34060e = bVar.f34115e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Address address = (Address) obj;
            String str = address.f34056a;
            String str2 = this.f34056a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = address.f34057b;
            String str4 = this.f34057b;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = address.f34058c;
            String str6 = this.f34058c;
            if (str6 == null ? str5 != null : !str6.equals(str5)) {
                return false;
            }
            String str7 = address.f34059d;
            String str8 = this.f34059d;
            if (str8 == null ? str7 != null : !str8.equals(str7)) {
                return false;
            }
            String str9 = address.f34060e;
            String str10 = this.f34060e;
            return str10 != null ? str10.equals(str9) : str9 == null;
        }

        public final int hashCode() {
            String str = this.f34056a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f34057b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f34058c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f34059d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f34060e;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Address{streetAddress='");
            sb3.append(this.f34056a);
            sb3.append("', locality='");
            sb3.append(this.f34057b);
            sb3.append("', region='");
            sb3.append(this.f34058c);
            sb3.append("', postalCode='");
            sb3.append(this.f34059d);
            sb3.append("', country='");
            return a.a.p(sb3, this.f34060e, "'}");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.writeString(this.f34056a);
            parcel.writeString(this.f34057b);
            parcel.writeString(this.f34058c);
            parcel.writeString(this.f34059d);
            parcel.writeString(this.f34060e);
        }

        public Address(Parcel parcel) {
            this.f34056a = parcel.readString();
            this.f34057b = parcel.readString();
            this.f34058c = parcel.readString();
            this.f34059d = parcel.readString();
            this.f34060e = parcel.readString();
        }
    }

    public LineIdToken(Parcel parcel) {
        this.f34035a = parcel.readString();
        this.f34036b = parcel.readString();
        this.f34037c = parcel.readString();
        this.f34038d = parcel.readString();
        this.f34039e = b0.J1(parcel);
        this.f34040f = b0.J1(parcel);
        this.f34041g = b0.J1(parcel);
        this.f34042h = parcel.readString();
        this.f34043i = parcel.createStringArrayList();
        this.f34044j = parcel.readString();
        this.f34045k = parcel.readString();
        this.f34046l = parcel.readString();
        this.f34047m = parcel.readString();
        this.f34048n = parcel.readString();
        this.f34049o = parcel.readString();
        this.f34050p = (Address) parcel.readParcelable(Address.class.getClassLoader());
        this.f34051q = parcel.readString();
        this.f34052r = parcel.readString();
        this.f34053s = parcel.readString();
        this.f34054t = parcel.readString();
        this.f34055u = parcel.readString();
    }
}
