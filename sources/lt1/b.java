package lt1;

import android.media.MediaFormat;
import com.pinterest.mediaPipeline.PipelineException;
import e0.t;
import et1.j;
import et1.k;
import et1.v0;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements mt1.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f84794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f84795b;

    public b(c cVar) {
        this.f84795b = cVar;
    }

    @Override // mt1.c
    public final void b() {
        c cVar = this.f84795b;
        boolean z13 = cVar.f84796a.f60034a.getSampleTrackIndex() < 0;
        HashMap hashMap = cVar.f84801f;
        j jVar = cVar.f84796a;
        boolean containsKey = hashMap.containsKey(Integer.valueOf(jVar.f60034a.getSampleTrackIndex()));
        if (this.f84794a && containsKey) {
            throw new PipelineException("Demuxer provided a sample for a track after it was unselected", e0.b(new Pair("Demuxer", this)), null, null, ((v0) cVar.f84799d).f60109a, 12);
        }
        if (z13) {
            c();
            return;
        }
        if (containsKey) {
            ByteBuffer byteBuf = cVar.f84800e;
            byteBuf.clear();
            jVar.getClass();
            Intrinsics.checkNotNullParameter(byteBuf, "byteBuf");
            jVar.f60034a.readSampleData(byteBuf, 0);
            Object obj = hashMap.get(Integer.valueOf(jVar.f60034a.getSampleTrackIndex()));
            Intrinsics.f(obj);
            d dVar = (d) obj;
            long sampleTime = jVar.f60034a.getSampleTime();
            boolean z14 = (jVar.f60034a.getSampleFlags() & 1) != 0;
            MediaFormat mediaFormat = dVar.f84805a;
            nt1.a r13 = t.r(mediaFormat);
            ByteBuffer asReadOnlyBuffer = byteBuf.asReadOnlyBuffer();
            Intrinsics.f(asReadOnlyBuffer);
            k packet = new k(r13, asReadOnlyBuffer, z14, sampleTime);
            jVar.f60034a.advance();
            Intrinsics.checkNotNullParameter(packet, "packet");
            if (!dVar.f84808d) {
                dVar.f84810f.e(mediaFormat);
                dVar.f84808d = true;
            }
            dVar.f84809e.e(packet);
            if (this.f84794a) {
                return;
            }
            cVar.f84802g.e(new a(sampleTime, dVar.f84814j, dVar.f84806b));
        }
    }

    public final void c() {
        if (this.f84794a) {
            return;
        }
        this.f84794a = true;
        c cVar = this.f84795b;
        for (Map.Entry entry : cVar.f84801f.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            d dVar = (d) entry.getValue();
            if (!dVar.f84813i) {
                dVar.f84813i = true;
                dVar.f84809e.f();
                dVar.f84810f.f();
            }
            cVar.f84796a.e(intValue);
        }
        cVar.f84802g.f();
    }

    @Override // mt1.a
    public final void g() {
        c();
    }

    public final String toString() {
        return "TryDemux";
    }
}
