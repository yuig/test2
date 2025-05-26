package sa0;

import com.pinterest.shuffles.core.ui.model.CutoutModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class s implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f112188a;

    /* renamed from: b, reason: collision with root package name */
    public final CutoutModel f112189b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f112190c;

    /* renamed from: d, reason: collision with root package name */
    public final bp1.h f112191d;

    /* renamed from: e, reason: collision with root package name */
    public final List f112192e;

    public s(b0 source, CutoutModel cutoutModel, Integer num, bp1.h editorSearchState, List initialSideEffectRequests) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(editorSearchState, "editorSearchState");
        Intrinsics.checkNotNullParameter(initialSideEffectRequests, "initialSideEffectRequests");
        this.f112188a = source;
        this.f112189b = cutoutModel;
        this.f112190c = num;
        this.f112191d = editorSearchState;
        this.f112192e = initialSideEffectRequests;
    }

    public static s b(s sVar, CutoutModel cutoutModel, bp1.h hVar, int i13) {
        b0 source = sVar.f112188a;
        if ((i13 & 2) != 0) {
            cutoutModel = sVar.f112189b;
        }
        CutoutModel cutoutModel2 = cutoutModel;
        Integer num = sVar.f112190c;
        if ((i13 & 8) != 0) {
            hVar = sVar.f112191d;
        }
        bp1.h editorSearchState = hVar;
        List initialSideEffectRequests = sVar.f112192e;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(editorSearchState, "editorSearchState");
        Intrinsics.checkNotNullParameter(initialSideEffectRequests, "initialSideEffectRequests");
        return new s(source, cutoutModel2, num, editorSearchState, initialSideEffectRequests);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f112188a, sVar.f112188a) && Intrinsics.d(this.f112189b, sVar.f112189b) && Intrinsics.d(this.f112190c, sVar.f112190c) && Intrinsics.d(this.f112191d, sVar.f112191d) && Intrinsics.d(this.f112192e, sVar.f112192e);
    }

    public final int hashCode() {
        int hashCode = this.f112188a.hashCode() * 31;
        CutoutModel cutoutModel = this.f112189b;
        int hashCode2 = (hashCode + (cutoutModel == null ? 0 : cutoutModel.hashCode())) * 31;
        Integer num = this.f112190c;
        return this.f112192e.hashCode() + ((this.f112191d.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CutoutEditorVMState(source=");
        sb3.append(this.f112188a);
        sb3.append(", selectedCutout=");
        sb3.append(this.f112189b);
        sb3.append(", maxCutoutItems=");
        sb3.append(this.f112190c);
        sb3.append(", editorSearchState=");
        sb3.append(this.f112191d);
        sb3.append(", initialSideEffectRequests=");
        return a.c.j(sb3, this.f112192e, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ s(sa0.b0 r7, java.lang.Integer r8, java.util.List r9, int r10) {
        /*
            r6 = this;
            r0 = r10 & 4
            if (r0 == 0) goto L5
            r8 = 0
        L5:
            r3 = r8
            u62.e r4 = u62.e.f120836a
            r8 = r10 & 16
            if (r8 == 0) goto L25
            sa0.l r8 = new sa0.l
            r8.<init>(r7, r3)
            r9 = 3
            sa0.o[] r9 = new sa0.o[r9]
            r10 = 0
            r9[r10] = r8
            sa0.m r8 = sa0.m.f112180a
            r10 = 1
            r9[r10] = r8
            sa0.n r8 = sa0.n.f112181a
            r10 = 2
            r9[r10] = r8
            java.util.List r9 = kotlin.collections.f0.j(r9)
        L25:
            r5 = r9
            r2 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.s.<init>(sa0.b0, java.lang.Integer, java.util.List, int):void");
    }
}
