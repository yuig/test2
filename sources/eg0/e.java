package eg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final String f58897c;

    /* renamed from: d, reason: collision with root package name */
    public final d f58898d;

    /* renamed from: e, reason: collision with root package name */
    public final int f58899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vd0.c cVar) {
        super(null, null);
        String message = String.valueOf(cVar.o("message", ""));
        vd0.c m13 = cVar.m("complete_button");
        Object e13 = m13 != null ? vd0.c.f125622b.e(m13.f125623a, d.class) : null;
        int j13 = cVar.j(0, "anchor");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f58897c = message;
        this.f58898d = (d) e13;
        this.f58899e = j13;
    }
}
