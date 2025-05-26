package c11;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import vq0.h;
import w01.z;
import yk1.m;

/* loaded from: classes5.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f24490a;

    /* renamed from: b, reason: collision with root package name */
    public final w f24491b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f24492c;

    public b(uk1.d presenterPinalytics, w eventManager, wk2.a presenterFactory) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        this.f24490a = presenterPinalytics;
        this.f24491b = eventManager;
        this.f24492c = presenterFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.view.ViewGroup, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, java.lang.Object, rq.x2] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    @Override // vq0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(yk1.n r36, java.lang.Object r37, int r38) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c11.b.c(yk1.n, java.lang.Object, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f24490a, bVar.f24490a) && Intrinsics.d(this.f24491b, bVar.f24491b) && Intrinsics.d(this.f24492c, bVar.f24492c);
    }

    @Override // vq0.h
    public final m f() {
        return (z) this.f24492c.get();
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    public final int hashCode() {
        return this.f24492c.hashCode() + ((this.f24491b.hashCode() + (this.f24490a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PinCloseupFilterQueriesViewBinder(presenterPinalytics=" + this.f24490a + ", eventManager=" + this.f24491b + ", presenterFactory=" + this.f24492c + ")";
    }
}
