package jc2;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m7.l0;
import m7.w0;
import tb0.p;
import vb0.j;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f75477a = new ArrayList();

    public c() {
        f0.u0(this);
    }

    public final b a(ExoPlayer exoPlayer) {
        Iterator it = this.f75477a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (Intrinsics.d(bVar.a().get(), exoPlayer)) {
                return bVar;
            }
        }
        return null;
    }

    public final void b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f75477a;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.b();
            if (bVar.f75476c == a.DONE) {
                ExoPlayer exoPlayer = (ExoPlayer) bVar.f75475b.get();
                if (exoPlayer != null) {
                    ((l0) exoPlayer).j(bVar);
                }
                arrayList.add(bVar);
            }
        }
        arrayList2.removeAll(arrayList);
        b bVar2 = (b) CollectionsKt.firstOrNull(arrayList2);
        if (bVar2 == null) {
            return;
        }
        a aVar = bVar2.f75476c;
        a aVar2 = a.PREPARING;
        if (aVar == aVar2) {
            return;
        }
        Object obj = bVar2.f75475b.get();
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Intrinsics.checkNotNullExpressionValue(obj, "requireNotNull(...)");
        bVar2.f75476c = aVar2;
        ((l0) ((ExoPlayer) obj)).b();
    }

    public final void c(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        j.f125466a.P("VideoPrepareQueue", p.VIDEO_PLAYER);
        w0 w0Var = ((l0) player).f86275m.f86415f;
        b a13 = a(player);
        if (a13 != null) {
            d(a13);
        }
    }

    public final void d(b bVar) {
        ExoPlayer exoPlayer = (ExoPlayer) bVar.f75475b.get();
        if (exoPlayer != null) {
            ((l0) exoPlayer).j(bVar);
        }
        this.f75477a.remove(bVar);
        b();
    }
}
