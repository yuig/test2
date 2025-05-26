package ac2;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l1 implements at1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1991b;

    public /* synthetic */ l1(Object obj, int i13) {
        this.f1990a = i13;
        this.f1991b = obj;
    }

    @Override // at1.k
    public final void onTrimMemory(int i13) {
        int i14 = this.f1990a;
        Object obj = this.f1991b;
        switch (i14) {
            case 0:
                o1 o1Var = (o1) obj;
                o1Var.f2021x = true;
                o1Var.f2006i.getClass();
                hc2.d dVar = o1Var.f2007j;
                dVar.getClass();
                hc2.d.a();
                dVar.f();
                if (i13 == 15) {
                    if (!dVar.c()) {
                        m7.l0 l0Var = dVar.f68745e;
                        if (l0Var != null) {
                            l0Var.a();
                        }
                        dVar.f68745e = null;
                        break;
                    } else {
                        LinkedHashMap linkedHashMap = dVar.f68746f;
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            ((m7.l0) ((ExoPlayer) ((Map.Entry) it.next()).getValue())).a();
                        }
                        linkedHashMap.clear();
                        break;
                    }
                }
                break;
            default:
                ((dc2.e) obj).f54405m = true;
                break;
        }
    }
}
