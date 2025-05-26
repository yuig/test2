package lt1;

import android.media.MediaFormat;
import et1.h0;
import et1.j0;
import et1.v0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mt1.j;

/* loaded from: classes4.dex */
public final class d implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final MediaFormat f84805a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ et1.c f84807c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84808d;

    /* renamed from: e, reason: collision with root package name */
    public final j f84809e;

    /* renamed from: f, reason: collision with root package name */
    public final j f84810f;

    /* renamed from: g, reason: collision with root package name */
    public final j f84811g;

    /* renamed from: h, reason: collision with root package name */
    public final j f84812h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f84813i;

    /* renamed from: j, reason: collision with root package name */
    public final j0 f84814j;

    public d(MediaFormat mediaFormat, int i13, h0 simpleProducerFactory, et1.c mutableSubcomponent) {
        Intrinsics.checkNotNullParameter(mediaFormat, "trackFormat");
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        Intrinsics.checkNotNullParameter(mutableSubcomponent, "mutableSubcomponent");
        this.f84805a = mediaFormat;
        this.f84806b = i13;
        this.f84807c = mutableSubcomponent;
        simpleProducerFactory.getClass();
        j jVar = new j();
        this.f84809e = jVar;
        j jVar2 = new j();
        this.f84810f = jVar2;
        this.f84811g = jVar;
        this.f84812h = jVar2;
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        j0 d2 = nt1.d.d(mediaFormat.getString("mime"));
        Intrinsics.f(d2);
        this.f84814j = d2;
        v0 v0Var = (v0) mutableSubcomponent;
        v0Var.a(jVar, "On Packet Demultiplexed");
        v0Var.a(jVar2, "On Output Media Format Changed");
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((v0) this.f84807c).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((v0) this.f84807c).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f84807c.j(callback);
    }

    public final String toString() {
        return "DemuxerTrack sentEndOfStream=[" + this.f84813i + "] inputFormat=[" + this.f84805a + "]";
    }
}
