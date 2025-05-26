package yy0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.i0;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: g, reason: collision with root package name */
    public static final vo.i f140429g = new vo.i(9, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final yl1.b f140430h = new yl1.b(bs1.c.j2(new String[0], x0.next), false, null, null, yl1.d.PRIMARY.getColorPalette(), yl1.c.LARGE, null, null, 0, null, 972);

    /* renamed from: a, reason: collision with root package name */
    public final List f140431a;

    /* renamed from: b, reason: collision with root package name */
    public final yl1.b f140432b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f140433c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.a0 f140434d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f140435e;

    /* renamed from: f, reason: collision with root package name */
    public final int f140436f;

    public d(List useCases, yl1.b cta, i0 subtitle, zy.a0 pinalyticsDisplayState) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f140431a = useCases;
        this.f140432b = cta;
        this.f140433c = subtitle;
        this.f140434d = pinalyticsDisplayState;
        this.f140435e = useCases.isEmpty();
        List list = useCases;
        int i13 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((f0) it.next()).f140454e && (i13 = i13 + 1) < 0) {
                    kotlin.collections.f0.o();
                    throw null;
                }
            }
        }
        this.f140436f = i13;
    }

    public static d e(d dVar, List useCases, yl1.b cta, i0 subtitle, zy.a0 pinalyticsDisplayState, int i13) {
        if ((i13 & 1) != 0) {
            useCases = dVar.f140431a;
        }
        if ((i13 & 2) != 0) {
            cta = dVar.f140432b;
        }
        if ((i13 & 4) != 0) {
            subtitle = dVar.f140433c;
        }
        if ((i13 & 8) != 0) {
            pinalyticsDisplayState = dVar.f140434d;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new d(useCases, cta, subtitle, pinalyticsDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f140431a, dVar.f140431a) && Intrinsics.d(this.f140432b, dVar.f140432b) && Intrinsics.d(this.f140433c, dVar.f140433c) && Intrinsics.d(this.f140434d, dVar.f140434d);
    }

    public final int hashCode() {
        return this.f140434d.hashCode() + ep.b.d(this.f140433c, (this.f140432b.hashCode() + (this.f140431a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "NuxUseCasePickerDisplayState(useCases=" + this.f140431a + ", cta=" + this.f140432b + ", subtitle=" + this.f140433c + ", pinalyticsDisplayState=" + this.f140434d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d() {
        /*
            r5 = this;
            kotlin.collections.q0 r0 = kotlin.collections.q0.f80391a
            int r1 = jv1.g.use_case_picker_subtitle_before_minimum
            java.lang.String r2 = "1"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r3 = "formatArgs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            u50.j0 r3 = new u50.j0
            java.util.List r2 = kotlin.collections.c0.b0(r2)
            r4 = 1
            r3.<init>(r1, r4, r2)
            zy.a0 r1 = new zy.a0
            r1.<init>()
            yl1.b r2 = yy0.d.f140430h
            r5.<init>(r0, r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yy0.d.<init>():void");
    }
}
