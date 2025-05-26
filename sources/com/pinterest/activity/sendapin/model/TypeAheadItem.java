package com.pinterest.activity.sendapin.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.api.model.ue;
import df.j1;
import dl1.s;
import er.a;
import er.b;
import er.c;
import er.d;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.x0;
import oi.e7;
import oo1.j;
import oo1.m;
import pk.a0;
import z40.n;

/* loaded from: classes3.dex */
public class TypeAheadItem implements Comparable, Serializable, a, Parcelable, s {
    public static final Parcelable.Creator<TypeAheadItem> CREATOR;

    /* renamed from: u, reason: collision with root package name */
    public static final b f35139u;

    /* renamed from: a, reason: collision with root package name */
    public String f35140a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35141b;

    /* renamed from: c, reason: collision with root package name */
    public String f35142c;

    /* renamed from: d, reason: collision with root package name */
    public String f35143d;

    /* renamed from: e, reason: collision with root package name */
    public String f35144e;

    /* renamed from: f, reason: collision with root package name */
    public c f35145f;

    /* renamed from: g, reason: collision with root package name */
    public String f35146g;

    /* renamed from: h, reason: collision with root package name */
    public int f35147h;

    /* renamed from: i, reason: collision with root package name */
    public String f35148i;

    /* renamed from: j, reason: collision with root package name */
    public String f35149j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35150k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35151l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35152m;

    /* renamed from: n, reason: collision with root package name */
    public d f35153n;

    /* renamed from: o, reason: collision with root package name */
    public final int f35154o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractList f35155p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractList f35156q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractList f35157r;

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f35158s;

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f35159t;

    static {
        b bVar = new b();
        bVar.add(c.ADDRESS_BOOK_NON_PINNER);
        f35139u = bVar;
        CREATOR = new e7(26);
    }

    public TypeAheadItem() {
        this.f35145f = c.NONE;
        this.f35153n = d.NO_ACTION;
        this.f35155p = new LinkedList();
        this.f35156q = new LinkedList();
        this.f35157r = new LinkedList();
        this.f35158s = new HashSet();
        this.f35159t = new HashSet();
    }

    public final String A() {
        String str = this.f35140a;
        return str != null ? str : "";
    }

    public final void a(vd0.c cVar) {
        if (cVar.e("debug_reason") && cVar.m("debug_reason") != null) {
            this.f35144e = cVar.m("debug_reason").o("readable_reason", "");
        }
        if (!cVar.e("user") || cVar.m("user") == null) {
            u(cVar.k("external_users").b(0));
        } else {
            u(cVar.m("user"));
        }
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return A();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (!(obj instanceof TypeAheadItem)) {
            return 0;
        }
        TypeAheadItem typeAheadItem = (TypeAheadItem) obj;
        if (n() == null || typeAheadItem.n() == null) {
            return 0;
        }
        return n().compareToIgnoreCase(typeAheadItem.n());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(ue conversation) {
        if (conversation != 0) {
            b60.d activeUserManager = (b60.d) com.bumptech.glide.d.E();
            this.f35155p = kh2.d.I(conversation, activeUserManager.f());
            Context context = kb0.a.f79058b;
            String separator = f0.W().getString(x0.separator);
            j jVar = j.f96854a;
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            Intrinsics.checkNotNullParameter(separator, "separator");
            Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
            this.f35142c = j.c(conversation instanceof n ? new oo1.b(new m((n) conversation)) : new oo1.b(new oo1.n(conversation)), separator, activeUserManager);
            this.f35140a = conversation.getId();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeAheadItem)) {
            return false;
        }
        TypeAheadItem typeAheadItem = (TypeAheadItem) obj;
        if (!a0.N(this.f35140a, typeAheadItem.f35140a) || !a0.N(this.f35143d, typeAheadItem.f35143d) || !a0.N(this.f35146g, typeAheadItem.f35146g) || !a0.N(this.f35142c, typeAheadItem.f35142c)) {
            return false;
        }
        AbstractList abstractList = this.f35156q;
        AbstractList abstractList2 = typeAheadItem.f35156q;
        if (abstractList == null ? abstractList2 != null : !abstractList.equals(abstractList2)) {
            return false;
        }
        AbstractList abstractList3 = this.f35157r;
        AbstractList abstractList4 = typeAheadItem.f35157r;
        return abstractList3 != null ? abstractList3.equals(abstractList4) : abstractList4 == null;
    }

    public final void g(vd0.c cVar) {
        vd0.c m13;
        this.f35140a = cVar.o("id", "");
        this.f35142c = cVar.o("name", "");
        String o13 = cVar.o("email", "");
        if (!a0.x0(o13)) {
            this.f35143d = o13;
            HashSet hashSet = this.f35158s;
            if (!hashSet.contains(o13)) {
                this.f35156q.add(o13);
                hashSet.add(o13);
            }
            if (a0.x0(n())) {
                this.f35142c = o13;
            }
        }
        if (!cVar.e("picture") || (m13 = cVar.m("picture")) == null || m13.m("data") == null) {
            return;
        }
        s(m13.m("data").d("url"));
    }

    public final void h(vd0.c cVar) {
        this.f35142c = cVar.o("full_name", "");
        int j13 = cVar.j(0, "external_user_type");
        if (j13 != 1) {
            throw new Exception(j1.T("externalusercontact internal type %s not handled", Integer.valueOf(j13)));
        }
        String o13 = cVar.o("eid", "");
        if (a0.x0(o13)) {
            return;
        }
        this.f35143d = o13;
        HashSet hashSet = this.f35158s;
        if (!hashSet.contains(o13)) {
            this.f35156q.add(o13);
            hashSet.add(o13);
        }
        if (a0.x0(n())) {
            this.f35142c = o13;
        }
    }

    public final int hashCode() {
        String str = this.f35140a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void j(vd0.c cVar) {
        this.f35143d = cVar.o("username", "");
        this.f35142c = cVar.o("full_name", "");
        this.f35147h = cVar.j(0, "avatar_color_index");
        if (cVar.e("image_xlarge_url")) {
            s(cVar.o("image_xlarge_url", ""));
        } else if (cVar.e("image_large_url")) {
            s(cVar.o("image_large_url", ""));
        } else {
            s(cVar.o("image_medium_url", ""));
        }
        Boolean bool = Boolean.FALSE;
        this.f35151l = cVar.h("followed_by_me", bool).booleanValue();
        if (cVar.e("website_url")) {
            String d2 = cVar.d("website_url");
            boolean booleanValue = cVar.h("domain_verified", bool).booleanValue();
            if (!a0.x0(d2)) {
                this.f35149j = d2;
                this.f35150k = booleanValue;
            }
        }
        if (cVar.e("location")) {
            String d13 = cVar.d("location");
            if (a0.x0(d13)) {
                return;
            }
            this.f35148i = d13;
        }
    }

    public final String k() {
        String str = this.f35143d;
        return str != null ? str : "";
    }

    public final String l() {
        String str = this.f35146g;
        return str != null ? str : "";
    }

    public final String n() {
        String str = this.f35142c;
        return str != null ? str : "";
    }

    public final boolean q() {
        c cVar = this.f35145f;
        return cVar == c.CONNECT_FB_PLACEHOLDER || cVar == c.MESSENGER_PLACEHOLDER || cVar == c.SEARCH_PLACEHOLDER || cVar == c.EMAIL_PLACEHOLDER || cVar == c.EMPTY_PLACEHOLDER || cVar == c.SYNC_CONTACTS_PLACEHOLDER;
    }

    public final void s(String str) {
        if (str == null) {
            str = "";
        }
        this.f35146g = str;
    }

    public final String toString() {
        String str = this.f35142c;
        return str != null ? str : "";
    }

    public final void u(vd0.c cVar) {
        try {
            v(cVar.m("conversation"), cVar.o("type", ""));
            this.f35140a = cVar.o("id", "");
            int ordinal = this.f35145f.ordinal();
            if (ordinal == 11) {
                j(cVar);
            } else if (ordinal == 12) {
                this.f35142c = cVar.o("name", "");
                this.f35143d = cVar.o("url", "");
                s(cVar.o("image_thumbnail_url", ""));
            } else if (ordinal != 16) {
                switch (ordinal) {
                    case 6:
                    case 7:
                    case 8:
                        g(cVar);
                        break;
                    case 9:
                        h(cVar);
                        break;
                }
            } else {
                a(cVar);
            }
        } catch (Exception unused) {
        }
    }

    public final void v(vd0.c cVar, String str) {
        if (a0.N(str, "board")) {
            this.f35145f = c.BOARD;
            return;
        }
        if (a0.N(str, "yahoo_non_pinner")) {
            this.f35145f = c.YAHOO_CONTACT;
            return;
        }
        if (a0.N(str, "google_non_pinner")) {
            this.f35145f = c.GOOGLE_CONTACT;
            return;
        }
        if (a0.N(str, "emailcontact")) {
            this.f35145f = c.EMAIL_CONTACT;
            return;
        }
        if (a0.N(str, "externalusercontact")) {
            this.f35145f = c.EXTERNAL_CONTACT;
            return;
        }
        if (a0.N(str, "conversation") || cVar != null) {
            this.f35145f = c.CONVERSATION;
            return;
        }
        if (a0.N(str, "address_book_non_pinner")) {
            this.f35145f = c.ADDRESS_BOOK_NON_PINNER;
        } else if (a0.N(str, "contact")) {
            this.f35145f = c.CONTACT;
        } else {
            if (!a0.N(str, "user")) {
                throw new Exception(a.a.j("Couldn't identify Item type for ", str));
            }
            this.f35145f = c.PINNER;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f35147h);
        parcel.writeString(this.f35140a);
        parcel.writeString(this.f35141b);
        parcel.writeString(this.f35142c);
        parcel.writeString(this.f35143d);
        parcel.writeString(this.f35144e);
        parcel.writeInt(this.f35145f.ordinal());
        parcel.writeString(this.f35146g);
        parcel.writeString(this.f35148i);
        parcel.writeString(this.f35149j);
        parcel.writeByte(this.f35150k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35151l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35152m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f35153n.ordinal());
        parcel.writeInt(this.f35154o);
        parcel.writeList(this.f35155p);
        parcel.writeStringList(this.f35156q);
        parcel.writeStringList(this.f35157r);
        parcel.writeValue(this.f35158s);
        parcel.writeValue(this.f35159t);
    }

    public TypeAheadItem(Parcel parcel) {
        this.f35145f = c.NONE;
        this.f35153n = d.NO_ACTION;
        this.f35155p = new LinkedList();
        this.f35156q = new LinkedList();
        this.f35157r = new LinkedList();
        this.f35158s = new HashSet();
        this.f35159t = new HashSet();
        this.f35147h = parcel.readInt();
        this.f35140a = parcel.readString();
        this.f35141b = parcel.readString();
        this.f35142c = parcel.readString();
        this.f35143d = parcel.readString();
        this.f35144e = parcel.readString();
        this.f35145f = c.values()[parcel.readInt()];
        this.f35146g = parcel.readString();
        this.f35148i = parcel.readString();
        this.f35149j = parcel.readString();
        this.f35150k = parcel.readByte() != 0;
        this.f35151l = parcel.readByte() != 0;
        this.f35152m = parcel.readByte() != 0;
        this.f35153n = d.values()[parcel.readInt()];
        this.f35154o = parcel.readByte();
        ArrayList arrayList = new ArrayList();
        this.f35155p = arrayList;
        parcel.readList(arrayList, getClass().getClassLoader());
        this.f35156q = parcel.createStringArrayList();
        this.f35157r = parcel.createStringArrayList();
        this.f35158s = (HashSet) parcel.readValue(HashSet.class.getClassLoader());
        this.f35159t = (HashSet) parcel.readValue(HashSet.class.getClassLoader());
    }
}
