package fz;

import com.pinterest.api.model.es0;
import cz.e;
import hz.d;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import yk1.b;
import yk1.n;

/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final e f63111a;

    /* renamed from: b, reason: collision with root package name */
    public es0 f63112b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e anketManager) {
        super(0);
        Intrinsics.checkNotNullParameter(anketManager, "anketManager");
        this.f63111a = anketManager;
    }

    @Override // yk1.b, yk1.m
    public final void bind(n nVar) {
        ez.a view = (ez.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        d dVar = (d) view;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        dVar.f70604l0 = this;
    }

    public final void p3(Integer num) {
        cz.b bVar = num != null ? new cz.b(e0.b(num), null, 2) : null;
        es0 es0Var = this.f63112b;
        this.f63111a.d(es0Var != null ? es0Var.f37337d : null, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q3(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L19
            boolean r1 = kotlin.text.z.j(r4)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto Lc
            goto Ld
        Lc:
            r4 = r0
        Ld:
            if (r4 == 0) goto L19
            cz.b r1 = new cz.b
            java.util.List r4 = kotlin.collections.e0.b(r4)
            r1.<init>(r0, r4, r2)
            goto L1a
        L19:
            r1 = r0
        L1a:
            com.pinterest.api.model.es0 r4 = r3.f63112b
            if (r4 == 0) goto L20
            java.lang.String r0 = r4.f37337d
        L20:
            cz.e r4 = r3.f63111a
            r4.d(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fz.a.q3(java.lang.String):void");
    }

    public final void r3(ArrayList answerValues) {
        Intrinsics.checkNotNullParameter(answerValues, "answerValues");
        cz.b bVar = (answerValues.isEmpty() ^ true ? answerValues : null) != null ? new cz.b(answerValues, null, 2) : null;
        es0 es0Var = this.f63112b;
        this.f63111a.d(es0Var != null ? es0Var.f37337d : null, bVar);
    }

    public final void s3() {
        es0 es0Var;
        e eVar = this.f63111a;
        HashMap hashMap = eVar.f53461i;
        es0 es0Var2 = this.f63112b;
        if (hashMap.containsKey(es0Var2 != null ? es0Var2.f37337d : null) || (es0Var = this.f63112b) == null) {
            return;
        }
        if (Intrinsics.d(es0Var.f37341h, Boolean.FALSE)) {
            es0 es0Var3 = this.f63112b;
            eVar.d(es0Var3 != null ? es0Var3.f37337d : null, null);
        }
    }

    public final void t3(es0 es0Var) {
        this.f63112b = es0Var;
    }
}
