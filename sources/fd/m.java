package fd;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f61780a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f61781b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public j f61782c;

    /* renamed from: d, reason: collision with root package name */
    public Long f61783d;

    /* renamed from: e, reason: collision with root package name */
    public f f61784e;

    /* renamed from: f, reason: collision with root package name */
    public kl2.l f61785f;

    public final y a() {
        Function1 function1 = this.f61780a;
        if (function1 == null) {
            throw new IllegalStateException("No serverUrl specified".toString());
        }
        ArrayList arrayList = this.f61781b;
        j jVar = this.f61782c;
        if (jVar == null) {
            jVar = new d();
        }
        j jVar2 = jVar;
        Long l13 = this.f61783d;
        long longValue = l13 != null ? l13.longValue() : 60000L;
        f fVar = this.f61784e;
        if (fVar == null) {
            fVar = new f();
        }
        return new y(function1, arrayList, jVar2, longValue, fVar, this.f61785f);
    }

    public final void b(String serverUrl) {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        this.f61780a = new l(serverUrl, null);
    }
}
