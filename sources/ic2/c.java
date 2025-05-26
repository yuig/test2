package ic2;

import a7.f;
import a7.i1;
import a7.o1;
import a7.u0;
import ac2.e0;
import ac2.m0;
import android.util.SizeF;
import androidx.media3.common.PlaybackException;
import g8.a0;
import g8.v;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lb0.q;
import nc2.g;
import se.l;
import vb0.j;

/* loaded from: classes2.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public final g f72109c;

    /* renamed from: d, reason: collision with root package name */
    public final String f72110d;

    /* renamed from: e, reason: collision with root package name */
    public final hc2.g f72111e;

    /* renamed from: f, reason: collision with root package name */
    public a f72112f;

    /* renamed from: g, reason: collision with root package name */
    public e f72113g;

    public c(q prefsManagerPersisted, g eventLogger, String videoUriPath, hc2.g fastDashConfig) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(videoUriPath, "videoUriPath");
        Intrinsics.checkNotNullParameter(fastDashConfig, "fastDashConfig");
        this.f72109c = eventLogger;
        this.f72110d = videoUriPath;
        this.f72111e = fastDashConfig;
        this.f72112f = new a();
    }

    @Override // n7.c
    public final void F(n7.b eventTime, PlaybackException error) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f72109c.N(error.f18745a, error);
    }

    @Override // n7.c
    public final void G(n7.b eventTime, v loadEventInfo, a0 mediaLoadData) {
        String str;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
        Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
        androidx.media3.common.b bVar = mediaLoadData.f64181c;
        if (bVar == null || (str = bVar.f18765o) == null || !StringsKt.E(str, "audio/", false)) {
            String uri = loadEventInfo.f64441a.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            int i13 = mediaLoadData.f64179a;
            int i14 = mediaLoadData.f64180b;
            g gVar = this.f72109c;
            gVar.d(i13, i14, uri);
            androidx.media3.common.b bVar2 = mediaLoadData.f64181c;
            if (bVar2 != null) {
                long j13 = bVar2.f18760j;
                long j14 = eventTime.f89386i;
                gVar.j(j13);
            }
        }
    }

    @Override // n7.c
    public final void I(n7.b eventTime, androidx.media3.common.b format) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(format, "format");
        Objects.toString(format);
        String str = format.f18765o;
        if (str == null || !StringsKt.E(str, "audio/", false)) {
            long j13 = eventTime.f89386i;
            this.f72109c.w(format);
        }
    }

    @Override // n7.c
    public final void O(n7.b eventTime, i1 tracks) {
        e eVar;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        l.f(tracks);
        this.f72109c.k(tracks);
        if (tracks.f1079a.isEmpty() || (eVar = this.f72113g) == null) {
            return;
        }
        eVar.a(tracks.a());
    }

    @Override // n7.c
    public final void Q(n7.b eventTime, int i13, long j13, long j14) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        this.f72109c.v(j14);
    }

    @Override // ic2.d
    public final void X(long j13) {
        a aVar = this.f72112f;
        double d2 = aVar.f72100a;
        this.f72109c.c(j13, aVar.f72105f);
    }

    @Override // ic2.d
    public final void c0(long j13, e0 playerDisconnectReason) {
        Intrinsics.checkNotNullParameter(playerDisconnectReason, "playerDisconnectReason");
        this.f72109c.e(this.f72112f.f72105f, j13, playerDisconnectReason);
        if (this.f72111e.a(this.f72110d) && playerDisconnectReason == e0.GridToCloseupPlayerReuse) {
            return;
        }
        this.f72112f = new a();
    }

    @Override // n7.c
    public final void d(n7.b eventTime) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        this.f72109c.t(eventTime.f89386i, this.f72112f.f72105f);
    }

    @Override // ic2.d
    public final void d0(int i13, Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f72109c.N(i13, error);
    }

    @Override // n7.c
    public final void e(n7.b eventTime, int i13, int i14) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        a aVar = this.f72112f;
        aVar.f72100a = i13;
        aVar.f72101b = i14;
        a aVar2 = this.f72112f;
        this.f72109c.A(new SizeF((float) aVar2.f72100a, (float) aVar2.f72101b), this.f72112f.f72105f, eventTime.f89386i);
    }

    @Override // ic2.d
    public final void e0(float f13, qc2.c viewability, boolean z13, boolean z14, long j13) {
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        this.f72109c.i(viewability, z13, j13, this.f72112f.f72105f);
    }

    @Override // ic2.d
    public final void j(n7.b eventTime, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        long j13 = eventTime.f89386i;
        this.f72109c.r(i13, z13, j13, this.f72112f.f72105f, new b(i13, z13, this, j13));
    }

    @Override // n7.c
    public final void l(int i13, n7.b eventTime) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        this.f72109c.L(i13);
    }

    @Override // n7.c
    public final void n(n7.b eventTime, f audioAttributes) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(audioAttributes, "audioAttributes");
        f fVar = m0.f1992a;
        Intrinsics.checkNotNullParameter(audioAttributes, "<this>");
        this.f72109c.z(audioAttributes.f991d == 3 ? 0.0f : 1.0f);
    }

    @Override // ic2.d
    public final void o(boolean z13, long j13) {
        this.f72109c.n(j13, z13);
    }

    @Override // n7.c
    public final void v(n7.b eventTime, Object output) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(output, "output");
        a aVar = this.f72112f;
        this.f72109c.B(new SizeF((float) aVar.f72100a, (float) aVar.f72101b), this.f72112f.f72105f, eventTime.f89386i);
    }

    @Override // n7.c
    public final void w(n7.b eventTime, o1 videoSize) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        SizeF dimensions = new SizeF(videoSize.f1159a, videoSize.f1160b);
        long j13 = this.f72112f.f72105f;
        long j14 = eventTime.f89386i;
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        this.f72109c.I(dimensions, j13, j14);
    }

    @Override // ic2.d, n7.c
    public final void x(n7.b eventTime, u0 oldPosition, u0 newPosition, int i13) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        super.x(eventTime, oldPosition, newPosition, i13);
        g gVar = this.f72109c;
        if (i13 == 0) {
            a aVar = this.f72112f;
            double d2 = aVar.f72100a;
            gVar.b(aVar.f72105f);
        } else {
            if (i13 != 1) {
                return;
            }
            gVar.x(eventTime.f89386i, this.f72112f.f72105f);
        }
    }

    @Override // ic2.d
    public final void z(long j13, long j14) {
        long j15 = this.f72112f.f72105f;
        if (j15 != -9223372036854775807L) {
            boolean z13 = j15 == j14;
            StringBuilder u13 = a.a.u("Duration passed has changed!", j15, " != ");
            u13.append(j14);
            j.f125466a.T(z13, u13.toString(), new Object[0]);
        }
        this.f72112f.f72105f = j14;
        this.f72109c.C(j14);
    }
}
