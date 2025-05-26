package xd0;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f134619a;

    /* renamed from: b, reason: collision with root package name */
    public final v f134620b;

    /* renamed from: c, reason: collision with root package name */
    public final v f134621c;

    public h(f0 ideaPinGson) {
        Intrinsics.checkNotNullParameter(ideaPinGson, "ideaPinGson");
        this.f134619a = ideaPinGson;
        this.f134620b = m.b(new g(this, 1));
        this.f134621c = m.b(new g(this, 0));
    }

    public static Long a(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    public static Date b(Long l13) {
        if (l13 != null) {
            return new Date(l13.longValue());
        }
        return null;
    }
}
