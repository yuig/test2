package hc2;

import a7.h0;
import a7.i0;
import ac2.f1;
import android.net.Uri;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import g8.d0;
import g8.j1;
import g8.m0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.z;
import m60.f0;
import pk.c1;
import pk.y0;

/* loaded from: classes2.dex */
public final class l implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f68768a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.e f68769b;

    /* renamed from: c, reason: collision with root package name */
    public final g f68770c;

    /* renamed from: d, reason: collision with root package name */
    public final f1 f68771d;

    /* renamed from: e, reason: collision with root package name */
    public final fc2.a f68772e;

    /* renamed from: f, reason: collision with root package name */
    public a10.e f68773f;

    /* renamed from: g, reason: collision with root package name */
    public s7.i f68774g;

    /* renamed from: h, reason: collision with root package name */
    public final q7.e f68775h;

    public l(g8.q upstreamMediaSourceFactory, h7.d dataSourceFactory, g fastDashConfig, f1 f1Var, fc2.a dashManifestEditor) {
        Intrinsics.checkNotNullParameter(upstreamMediaSourceFactory, "upstreamMediaSourceFactory");
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
        Intrinsics.checkNotNullParameter(fastDashConfig, "fastDashConfig");
        Intrinsics.checkNotNullParameter(dashManifestEditor, "dashManifestEditor");
        this.f68768a = upstreamMediaSourceFactory;
        this.f68769b = dataSourceFactory;
        this.f68770c = fastDashConfig;
        this.f68771d = f1Var;
        this.f68772e = dashManifestEditor;
        this.f68775h = new q7.e();
    }

    @Override // g8.d0
    public final g8.a d(i0 mediaItem) {
        p7.n nVar;
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        a7.d0 d0Var = mediaItem.f1073b;
        d0 d0Var2 = this.f68768a;
        if (d0Var != null) {
            String url = d0Var.f969a.toString();
            Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
            Intrinsics.checkNotNullParameter(url, "url");
            if (d7.b.V(url) == bc2.j.DASH && !z.h(url, "warm.mpd", false) && !z.h(url, "warm.mp4", false)) {
                Object obj = d0Var.f975g;
                if ((obj instanceof j) && ((j) obj).f68765c != null) {
                    g gVar = this.f68770c;
                    a7.d0 d0Var3 = mediaItem.f1073b;
                    g8.a aVar = null;
                    Object obj2 = d0Var3 != null ? d0Var3.f975g : null;
                    boolean z13 = obj2 instanceof j;
                    f0 f0Var = vb0.j.f125466a;
                    if (z13) {
                        if (((j) obj2).f68765c != null) {
                            try {
                                q7.e eVar = this.f68775h;
                                Intrinsics.f(d0Var3);
                                Uri uri = d0Var3.f969a;
                                byte[] bytes = ((j) obj2).f68765c.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                                q7.c k13 = eVar.k(uri, new ByteArrayInputStream(bytes));
                                Intrinsics.checkNotNullExpressionValue(k13, "parse(...)");
                                if (!(!k13.f102607d)) {
                                    throw new IllegalArgumentException("Failed requirement.".toString());
                                }
                                q7.c a13 = this.f68772e.a(mediaItem, k13);
                                p7.m mVar = new p7.m(this.f68769b);
                                gVar.getClass();
                                int i13 = k.f68767a[e.NEVER.ordinal()];
                                if (i13 == 1) {
                                    nVar = p7.n.NEVER;
                                } else if (i13 == 2) {
                                    nVar = p7.n.ALWAYS;
                                } else {
                                    if (i13 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    nVar = p7.n.AT_POSITION_0;
                                }
                                mVar.f99010e = nVar;
                                mVar.f99009d = false;
                                Intrinsics.checkNotNullExpressionValue(mVar, "setPinterestHasPartialManifest(...)");
                                DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(mVar, null);
                                a10.e eVar2 = this.f68773f;
                                if (eVar2 != null) {
                                    dashMediaSource$Factory.f18804f = eVar2;
                                }
                                s7.i iVar = this.f68774g;
                                if (iVar != null) {
                                    dashMediaSource$Factory.f18802d = iVar;
                                }
                                p7.j h10 = dashMediaSource$Factory.h(mediaItem, a13);
                                Intrinsics.checkNotNullExpressionValue(h10, "createMediaSource(...)");
                                g8.a aVar2 = h10;
                                if (this.f68771d != null) {
                                    aVar2 = h10;
                                    if (f1.a(((j) obj2).f68763a, ((j) obj2).f68764b, false)) {
                                        aVar2 = h(mediaItem, h10);
                                    }
                                }
                                aVar = aVar2;
                            } catch (Throwable unused) {
                            }
                        } else {
                            f0Var.F("createDashMediaSourceWithServerSentManifest, no server sent manifest present", tb0.p.VIDEO_PLAYER, new Object[0]);
                        }
                    }
                    if (aVar != null) {
                        return aVar;
                    }
                    f0Var.F("unable to create fast dash metadata media source", tb0.p.VIDEO_PLAYER, new Object[0]);
                    g8.a d2 = d0Var2.d(mediaItem);
                    Intrinsics.checkNotNullExpressionValue(d2, "createMediaSource(...)");
                    return d2;
                }
            }
        }
        g8.a d13 = d0Var2.d(mediaItem);
        Intrinsics.checkNotNullExpressionValue(d13, "createMediaSource(...)");
        return d13;
    }

    @Override // g8.d0
    public final d0 e(s7.i drmSessionManagerProvider) {
        Intrinsics.checkNotNullParameter(drmSessionManagerProvider, "drmSessionManagerProvider");
        this.f68774g = drmSessionManagerProvider;
        d0 e13 = this.f68768a.e(drmSessionManagerProvider);
        Intrinsics.checkNotNullExpressionValue(e13, "setDrmSessionManagerProvider(...)");
        return e13;
    }

    @Override // g8.d0
    public final d0 g(a10.e loadErrorHandlingPolicy) {
        Intrinsics.checkNotNullParameter(loadErrorHandlingPolicy, "loadErrorHandlingPolicy");
        this.f68773f = loadErrorHandlingPolicy;
        d0 g13 = this.f68768a.g(loadErrorHandlingPolicy);
        Intrinsics.checkNotNullExpressionValue(g13, "setLoadErrorHandlingPolicy(...)");
        return g13;
    }

    public final g8.a h(i0 i0Var, p7.j jVar) {
        a7.d0 d0Var = i0Var.f1073b;
        Intrinsics.f(d0Var);
        c1 subtitleConfigurations = d0Var.f974f;
        Intrinsics.checkNotNullExpressionValue(subtitleConfigurations, "subtitleConfigurations");
        if (subtitleConfigurations.isEmpty()) {
            return jVar;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(jVar);
        y0 listIterator = subtitleConfigurations.listIterator(0);
        while (listIterator.hasNext()) {
            h0 h0Var = (h0) listIterator.next();
            g7.e eVar = this.f68769b;
            eVar.getClass();
            a10.e eVar2 = new a10.e();
            a10.e eVar3 = this.f68773f;
            j1 j1Var = new j1(h0Var, eVar, eVar3 != null ? eVar3 : eVar2, true, null);
            Intrinsics.checkNotNullExpressionValue(j1Var, "createMediaSource(...)");
            arrayList.add(j1Var);
        }
        g8.a[] aVarArr = (g8.a[]) arrayList.toArray(new g8.a[0]);
        return new m0((g8.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }
}
