package lf2;

import il2.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kh2.j2;
import kh2.l0;
import kh2.q;
import kh2.r0;
import rl2.u;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f83145b;

    public /* synthetic */ d(i iVar, int i13) {
        this.f83144a = i13;
        this.f83145b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f83144a;
        i iVar = this.f83145b;
        switch (i13) {
            case 0:
                j2 j2Var = iVar.f83150a;
                l0 l0Var = (l0) j2Var.f();
                u[] uVarArr = l0.f79585m;
                ch2.a aVar = (ch2.a) l0Var.f79597l.a(l0Var, uVarArr[10]);
                if (aVar != null) {
                    ((bg2.a) ((r0) j2Var.g()).c()).a(aVar);
                }
                l0 l0Var2 = (l0) iVar.f83150a.f();
                ch2.a aVar2 = (ch2.a) l0Var2.f79597l.a(l0Var2, uVarArr[10]);
                if (aVar2 != null) {
                    ((ch2.d) aVar2).e();
                    break;
                }
                break;
            default:
                dh2.f[] values = dh2.f.values();
                ArrayList arrayList = new ArrayList(values.length);
                for (dh2.f fVar : values) {
                    arrayList.add((File) fVar.asFile(((q) iVar.f83150a.d()).b(), (lh2.b) iVar.f83164o.getValue()).getValue());
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m.f((File) it.next());
                }
                break;
        }
    }
}
