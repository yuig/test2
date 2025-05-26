package lt1;

import android.media.MediaFormat;
import com.pinterest.mediaPipeline.PipelineException;
import e0.t;
import et1.h0;
import et1.j;
import et1.j0;
import et1.v0;
import java.nio.ByteBuffer;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final j f84796a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f84797b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f84798c;

    /* renamed from: d, reason: collision with root package name */
    public final et1.c f84799d;

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f84800e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f84801f;

    /* renamed from: g, reason: collision with root package name */
    public final mt1.j f84802g;

    /* renamed from: h, reason: collision with root package name */
    public final mt1.j f84803h;

    /* renamed from: i, reason: collision with root package name */
    public final b f84804i;

    public c(j extractor, h0 simpleProducerFactory, wk2.a mutableSubcomponentProvider) {
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        Intrinsics.checkNotNullParameter(mutableSubcomponentProvider, "mutableSubcomponentProvider");
        this.f84796a = extractor;
        this.f84797b = simpleProducerFactory;
        this.f84798c = mutableSubcomponentProvider;
        et1.c cVar = (et1.c) mutableSubcomponentProvider.get();
        this.f84799d = cVar;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
        Intrinsics.checkNotNullExpressionValue(allocateDirect, "allocateDirect(...)");
        this.f84800e = allocateDirect;
        this.f84801f = new HashMap();
        simpleProducerFactory.getClass();
        mt1.j jVar = new mt1.j();
        this.f84802g = jVar;
        this.f84803h = jVar;
        b bVar = new b(this);
        this.f84804i = bVar;
        v0 v0Var = (v0) cVar;
        v0Var.a(bVar, "Try Demultiplexing a Packet");
        v0Var.a(jVar, "Demuxer advanced");
    }

    public final d a(j0 trackSampleType, int i13) {
        Intrinsics.checkNotNullParameter(trackSampleType, "trackSampleType");
        j jVar = this.f84796a;
        int trackCount = jVar.f60034a.getTrackCount();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            et1.c cVar = this.f84799d;
            if (i14 >= trackCount) {
                throw new PipelineException("[" + trackSampleType + "] track [" + i13 + "] does not exist", e0.b(new Pair("Demuxer", this)), null, null, ((v0) cVar).f60109a, 12);
            }
            if (trackSampleType == nt1.d.d(t.r(jVar.a(i14)).c())) {
                if (i13 == i15) {
                    jVar.c(i14);
                    HashMap hashMap = this.f84801f;
                    Integer valueOf = Integer.valueOf(i14);
                    Object obj = hashMap.get(valueOf);
                    Object obj2 = obj;
                    if (obj == null) {
                        MediaFormat a13 = jVar.a(i14);
                        Object obj3 = this.f84798c.get();
                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                        d dVar = new d(a13, i13, this.f84797b, (et1.c) obj3);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(dVar.f84814j);
                        sb3.append(" Track ");
                        sb3.append(i13);
                        sb3.append(" (Track ");
                        ((v0) cVar).a(dVar, a.a.n(sb3, i14, " overall)"));
                        hashMap.put(valueOf, dVar);
                        obj2 = dVar;
                    }
                    return (d) obj2;
                }
                i15++;
            }
            i14++;
        }
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((v0) this.f84799d).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((v0) this.f84799d).h(callback);
    }

    public final String toString() {
        HashMap hashMap = this.f84801f;
        j jVar = this.f84796a;
        return "DemuxerNode tracks=[" + hashMap + "] extractor=[track count=[" + jVar.f60034a.getTrackCount() + "] sampleTrackIndex=[" + jVar.f60034a.getSampleTrackIndex() + "] sampleTime=[" + jVar.f60034a.getSampleTime() + "] sampleFlags=[" + jVar.f60034a.getSampleFlags() + "]]";
    }
}
