package hc2;

import a7.i1;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import d7.n0;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m7.l0;
import m7.w0;

/* loaded from: classes4.dex */
public final class h implements n7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f68755a;

    public h(i iVar) {
        this.f68755a = iVar;
    }

    @Override // n7.c
    public final void D(n7.b eventTime, boolean z13) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        i pendingPrefetch = this.f68755a;
        pendingPrefetch.getClass();
        tb0.p pVar = tb0.p.VIDEO_PLAYER;
        f0 f0Var = vb0.j.f125466a;
        f0Var.P("pendingPrefetch", pVar);
        if (z13 || pendingPrefetch.f68761f) {
            return;
        }
        pendingPrefetch.a();
        ExoPlayer player = pendingPrefetch.f68757b;
        Intrinsics.checkNotNullParameter(player, "player");
        l0 l0Var = (l0) player;
        long h10 = l0Var.h();
        w0 w0Var = l0Var.f86275m.f86415f;
        long max = Math.max(h10, w0Var != null ? n0.o0(((m7.n) w0Var).f86311l) : 0L);
        c cVar = pendingPrefetch.f68756a;
        String url = cVar.f();
        q trigger = cVar.f68740f;
        o oVar = pendingPrefetch.f68762g;
        p pVar2 = pendingPrefetch.f68758c;
        pVar2.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        f0Var.P("prefetchTracker", pVar);
        pVar2.f68783a.put(url, new n(trigger, max, oVar));
        b bVar = pendingPrefetch.f68759d;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pendingPrefetch, "pendingPrefetch");
        d dVar = bVar.f68734a;
        dVar.getClass();
        if (!dVar.c()) {
            if (Intrinsics.d(dVar.f68749i, pendingPrefetch)) {
                dVar.f68749i = null;
                dVar.e();
                return;
            }
            return;
        }
        bc2.j V = d7.b.V(cVar.f());
        LinkedHashMap linkedHashMap = dVar.f68747g;
        if (linkedHashMap.containsKey(V) && linkedHashMap.get(V) != null) {
            i iVar = (i) linkedHashMap.get(V);
            if (iVar == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (Intrinsics.d(iVar.f68756a.f(), cVar.f())) {
                linkedHashMap.remove(V);
            } else {
                f0Var.F("In-flight prefetch for the given streaming type should match complete prefetch", pVar, new Object[0]);
            }
        }
        dVar.e();
    }

    @Override // n7.c
    public final void F(n7.b eventTime, PlaybackException error) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(error, "error");
        Objects.toString(error);
        this.f68755a.getClass();
    }

    @Override // n7.c
    public final void O(n7.b eventTime, i1 tracks) {
        androidx.media3.common.b e13;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        se.l.f(tracks);
        i iVar = this.f68755a;
        iVar.getClass();
        if (iVar.f68762g != null || (e13 = se.l.e(tracks)) == null) {
            return;
        }
        iVar.f68762g = new o(e13.f18751a, e13.f18772v, e13.f18773w, e13.f18760j);
    }

    @Override // n7.c
    public final void h(n7.b eventTime, String decoderName) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(decoderName, "decoderName");
        vb0.j.f125466a.F("video decoder not allowed", tb0.p.VIDEO_PLAYER, new Object[0]);
    }

    @Override // n7.c
    public final void u(n7.b eventTime, String decoderName) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(decoderName, "decoderName");
        vb0.j.f125466a.F("audio decoder not allowed", tb0.p.VIDEO_PLAYER, new Object[0]);
    }
}
