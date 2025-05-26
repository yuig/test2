package sh0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f112922a;

    /* renamed from: b, reason: collision with root package name */
    public final String f112923b;

    /* renamed from: c, reason: collision with root package name */
    public List f112924c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f112925d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f112926e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f112927f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f112928g;

    /* renamed from: h, reason: collision with root package name */
    public d f112929h;

    /* renamed from: i, reason: collision with root package name */
    public long f112930i;

    public c(String id3, String text) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f112922a = id3;
        this.f112923b = text;
        this.f112924c = new ArrayList();
        this.f112925d = new HashMap();
        this.f112929h = d.UNKNOWN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f112922a, cVar.f112922a) && Intrinsics.d(this.f112923b, cVar.f112923b);
    }

    public final int hashCode() {
        return this.f112923b.hashCode() + (this.f112922a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ExpressSurveyQuestion(id=");
        sb3.append(this.f112922a);
        sb3.append(", text=");
        return a.a.p(sb3, this.f112923b, ")");
    }
}
