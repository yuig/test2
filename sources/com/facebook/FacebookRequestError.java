package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import df.o;
import df.p;
import i2.u1;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le.r;
import org.jetbrains.annotations.NotNull;
import q5.u;
import wc.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "le/r", "wc/j", "q5/u", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookRequestError implements Parcelable {

    /* renamed from: a */
    public final int f29905a;

    /* renamed from: b */
    public final int f29906b;

    /* renamed from: c */
    public final int f29907c;

    /* renamed from: d */
    public final String f29908d;

    /* renamed from: e */
    public final String f29909e;

    /* renamed from: f */
    public final String f29910f;

    /* renamed from: g */
    public final Object f29911g;

    /* renamed from: h */
    public final String f29912h;

    /* renamed from: i */
    public final FacebookException f29913i;

    /* renamed from: j */
    public static final j f29903j = new j(19, 0);

    /* renamed from: k */
    public static final u f29904k = new u(200, 299);

    @NotNull
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new u1(6);

    public FacebookRequestError(int i13, int i14, int i15, String str, String str2, String str3, String str4, Object obj, FacebookException facebookException, boolean z13) {
        r rVar;
        Set set;
        Set set2;
        Set set3;
        this.f29905a = i13;
        this.f29906b = i14;
        this.f29907c = i15;
        this.f29908d = str;
        this.f29909e = str3;
        this.f29910f = str4;
        this.f29911g = obj;
        this.f29912h = str2;
        j jVar = f29903j;
        if (facebookException != null) {
            this.f29913i = facebookException;
            rVar = r.OTHER;
        } else {
            this.f29913i = new FacebookServiceException(this, a());
            p t13 = jVar.t();
            if (z13) {
                t13.getClass();
                rVar = r.TRANSIENT;
            } else {
                Map map = t13.f54821a;
                if (map != null && map.containsKey(Integer.valueOf(i14)) && ((set3 = (Set) map.get(Integer.valueOf(i14))) == null || set3.contains(Integer.valueOf(i15)))) {
                    rVar = r.OTHER;
                } else {
                    Map map2 = t13.f54823c;
                    if (map2 != null && map2.containsKey(Integer.valueOf(i14)) && ((set2 = (Set) map2.get(Integer.valueOf(i14))) == null || set2.contains(Integer.valueOf(i15)))) {
                        rVar = r.LOGIN_RECOVERABLE;
                    } else {
                        Map map3 = t13.f54822b;
                        rVar = (map3 != null && map3.containsKey(Integer.valueOf(i14)) && ((set = (Set) map3.get(Integer.valueOf(i14))) == null || set.contains(Integer.valueOf(i15)))) ? r.TRANSIENT : r.OTHER;
                    }
                }
            }
        }
        jVar.t().getClass();
        if (rVar == null) {
            return;
        }
        int i16 = o.f54813a[rVar.ordinal()];
    }

    public final String a() {
        String str = this.f29912h;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.f29913i;
        if (facebookException == null) {
            return null;
        }
        return facebookException.getLocalizedMessage();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.f29905a + ", errorCode: " + this.f29906b + ", subErrorCode: " + this.f29907c + ", errorType: " + this.f29908d + ", errorMessage: " + a() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f29905a);
        out.writeInt(this.f29906b);
        out.writeInt(this.f29907c);
        out.writeString(this.f29908d);
        out.writeString(a());
        out.writeString(this.f29909e);
        out.writeString(this.f29910f);
    }

    public FacebookRequestError(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i13, String str, String str2) {
        this(-1, i13, -1, str, str2, null, null, null, null, false);
    }
}
