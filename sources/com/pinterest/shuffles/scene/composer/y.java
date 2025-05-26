package com.pinterest.shuffles.scene.composer;

import android.util.Size;
import android.view.TextureView;
import androidx.recyclerview.widget.g1;
import com.pinterest.api.model.iw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import kh2.g3;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r72.z1;
import y01.h1;

/* loaded from: classes4.dex */
public final class y extends s0 implements g1 {

    /* renamed from: h, reason: collision with root package name */
    public final x72.j f52176h;

    /* renamed from: i, reason: collision with root package name */
    public final n72.m f52177i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.recyclerview.widget.f f52178j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x72.j sceneView, ao2.j0 coroutineScope, n72.m shuffleCoreLogger) {
        super(pe.i.w(sceneView), coroutineScope);
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(shuffleCoreLogger, "shuffleCoreLogger");
        this.f52176h = sceneView;
        this.f52177i = shuffleCoreLogger;
        this.f52178j = new androidx.recyclerview.widget.f(this, new androidx.recyclerview.widget.c(d0.f52029b).a());
    }

    public static String o(ke2.d from) {
        Intrinsics.checkNotNullParameter(from, "from");
        z1 r03 = kh2.b0.r0(from);
        if (r03 != null) {
            return r03.b();
        }
        return null;
    }

    public static void r(y yVar, List list) {
        m onCommit = m.f52095k;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(onCommit, "onCommit");
        yVar.f52178j.b(list, new p4.a(8, onCommit));
    }

    @Override // com.pinterest.shuffles.scene.composer.f
    public final Size d() {
        return this.f52176h.a();
    }

    @Override // com.pinterest.shuffles.scene.composer.s0
    public final CompletableFuture i() {
        return this.f52176h.j();
    }

    @Override // androidx.recyclerview.widget.g1
    public final void j(int i13, int i14) {
        x72.j jVar = this.f52176h;
        q1.j0 j0Var = new q1.j0(i13, i14, 2);
        n72.m mVar = this.f52177i;
        mVar.c(j0Var);
        int i15 = 3;
        try {
            List subList = this.f52178j.f19375f.subList(i13, i13 + i14);
            mVar.g(new s1.c(subList, i15));
            CopyOnWriteArrayList copyOnWriteArrayList = jVar.getF52892h().f79314f;
            List list = subList;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(k((z1) it.next()));
            }
            copyOnWriteArrayList.addAll(i13, arrayList);
            e0.t.d(copyOnWriteArrayList);
        } catch (Exception e13) {
            mVar.d(e13, new q1.j0(i13, i14, i15));
        }
        TextureView k13 = jVar.k();
        q5.x.a(k13, new x(k13, this, 0));
    }

    @Override // com.pinterest.shuffles.scene.composer.s0
    public final ke2.c l() {
        return this.f52176h.getF52892h();
    }

    @Override // androidx.recyclerview.widget.g1
    public final void m(int i13, int i14) {
        q1.j0 j0Var = new q1.j0(i13, i14, 6);
        n72.m mVar = this.f52177i;
        mVar.c(j0Var);
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f52176h.getF52892h().f79314f;
            if (i14 == 1) {
                copyOnWriteArrayList.remove(i13);
            } else if (i13 == 0 && i14 == copyOnWriteArrayList.size()) {
                copyOnWriteArrayList.clear();
            } else {
                List subList = copyOnWriteArrayList.subList(i13, i13 + i14);
                Intrinsics.checkNotNullExpressionValue(subList, "subList(...)");
                copyOnWriteArrayList.removeIf(new iw(11, new h1(3, CollectionsKt.J0(subList))));
            }
            e0.t.d(copyOnWriteArrayList);
        } catch (Exception e13) {
            mVar.d(e13, new q1.j0(i13, i14, 7));
        }
    }

    @Override // androidx.recyclerview.widget.g1
    public final void p(int i13, Object obj, int i14) {
        float a13;
        float e13;
        float f13;
        w wVar = new w(i13, i14, obj, 0);
        n72.m mVar = this.f52177i;
        mVar.c(wVar);
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.shuffles.scene.composer.ChangePayload");
        i iVar = (i) obj;
        boolean z13 = iVar.f52057e;
        androidx.recyclerview.widget.f fVar = this.f52178j;
        int i15 = 1;
        x72.j jVar = this.f52176h;
        if (z13) {
            try {
                int i16 = i13 + i14;
                List subList = fVar.f19375f.subList(i13, i16);
                mVar.g(new s1.c(subList, 4));
                CopyOnWriteArrayList copyOnWriteArrayList = jVar.getF52892h().f79314f;
                List subList2 = copyOnWriteArrayList.subList(i13, i16);
                Intrinsics.checkNotNullExpressionValue(subList2, "subList(...)");
                copyOnWriteArrayList.replaceAll(new e10.e(i15, kotlin.collections.z0.m(CollectionsKt.N0(subList2, subList)), this));
                e0.t.d(copyOnWriteArrayList);
            } catch (Exception e14) {
                mVar.d(e14, new q1.j0(i13, i14, 8));
            }
            TextureView k13 = jVar.k();
            q5.x.a(k13, new x(k13, this, i15));
            return;
        }
        try {
            List list = fVar.f19375f;
            int i17 = i13 + i14;
            List subList3 = list.subList(i13, i17);
            mVar.g(new s1.c(subList3, 5));
            CopyOnWriteArrayList copyOnWriteArrayList2 = jVar.getF52892h().f79314f;
            List subList4 = copyOnWriteArrayList2.subList(i13, i17);
            Intrinsics.checkNotNullExpressionValue(subList4, "subList(...)");
            Iterator it = CollectionsKt.N0(subList4, subList3).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ke2.d dVar = (ke2.d) pair.f80346a;
                z1 z1Var = (z1) pair.f80347b;
                if (iVar.f52053a) {
                    Intrinsics.f(dVar);
                    Intrinsics.f(z1Var);
                    ke2.b a14 = a(z1Var, 0.0f);
                    Intrinsics.checkNotNullParameter(a14, "<set-?>");
                    dVar.f79320b = a14;
                    ke2.i iVar2 = dVar.f79319a;
                    if (iVar2 instanceof h) {
                        e13 = (float) z1Var.e();
                        f13 = ((h) iVar2).f52050p;
                    } else if (iVar2 instanceof c1) {
                        e13 = (float) z1Var.e();
                        f13 = ((c1) iVar2).f52020t;
                    } else {
                        a13 = iVar2.a();
                        iVar2.d(a13);
                    }
                    a13 = e13 * f13;
                    iVar2.d(a13);
                } else if (iVar.f52054b) {
                    g3.v(dVar.f79319a, z1Var.a());
                }
                Intrinsics.f(dVar);
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                dVar.f79321c.put(Integer.MAX_VALUE, z1Var);
            }
            e0.t.d(copyOnWriteArrayList2);
        } catch (Exception e15) {
            mVar.d(e15, new w(i13, i14, iVar, i15));
        }
    }

    @Override // androidx.recyclerview.widget.g1
    public final void q(int i13, int i14) {
        q1.j0 j0Var = new q1.j0(i13, i14, 4);
        n72.m mVar = this.f52177i;
        mVar.c(j0Var);
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f52176h.getF52892h().f79314f;
            copyOnWriteArrayList.add(i14, copyOnWriteArrayList.remove(i13));
            e0.t.d(copyOnWriteArrayList);
        } catch (Exception e13) {
            mVar.d(e13, new q1.j0(i13, i14, 5));
        }
    }
}
