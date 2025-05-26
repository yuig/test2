package et1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final kt1.b f60046a;

    /* renamed from: b, reason: collision with root package name */
    public final jg1.v f60047b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f60048c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f60049d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f60050e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f60051f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f60052g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f60053h;

    public m0(kt1.e muxer) {
        Intrinsics.checkNotNullParameter(muxer, "muxer");
        this.f60046a = muxer;
        this.f60047b = new jg1.v(muxer);
        this.f60051f = new ArrayList();
    }

    public final void a(j0 j0Var, MediaFormat mediaFormat) {
        jg1.v vVar = this.f60047b;
        vVar.getClass();
        int i13 = j0Var == null ? -1 : k0.f60041a[j0Var.ordinal()];
        if (i13 == 1) {
            vVar.f76066b = mediaFormat;
        } else {
            if (i13 != 2) {
                throw new AssertionError("Invalid SampleType");
            }
            vVar.f76067c = mediaFormat;
        }
        int i14 = j0Var != null ? l0.f60042a[j0Var.ordinal()] : -1;
        if (i14 == 1) {
            this.f60048c = true;
        } else if (i14 == 2) {
            this.f60049d = true;
        }
        if (this.f60049d && this.f60048c) {
            vVar.a();
            this.f60050e = true;
            ArrayList arrayList = this.f60051f;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n0 n0Var = (n0) it.next();
                b(n0Var.f60059a, n0Var.f60060b, n0Var.f60061c);
            }
            arrayList.clear();
        }
    }

    public final void b(j0 sampleType, ByteBuffer byteBuf, MediaCodec.BufferInfo bufferInfo) {
        int i13;
        Intrinsics.checkNotNullParameter(sampleType, "sampleType");
        Intrinsics.checkNotNullParameter(byteBuf, "byteBuf");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (!this.f60050e) {
            ArrayList arrayList = this.f60051f;
            Intrinsics.checkNotNullParameter(byteBuf, "<this>");
            int position = byteBuf.position();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuf.remaining());
            allocate.order(byteBuf.order());
            allocate.put(byteBuf);
            byteBuf.position(position);
            allocate.rewind();
            Intrinsics.checkNotNullParameter(bufferInfo, "<this>");
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.offset = bufferInfo.offset;
            bufferInfo2.size = bufferInfo.size;
            bufferInfo2.presentationTimeUs = bufferInfo.presentationTimeUs;
            bufferInfo2.flags = bufferInfo.flags;
            arrayList.add(new n0(sampleType, allocate, bufferInfo2));
            return;
        }
        if (this.f60052g && sampleType == j0.VIDEO) {
            throw new RuntimeException("Can't write packet info=[" + bufferInfo + "] buffer=[" + byteBuf + "] sampleType=[" + sampleType + "]");
        }
        if (this.f60053h && sampleType == j0.AUDIO) {
            throw new RuntimeException("Can't write packet info=[" + bufferInfo + "] buffer=[" + byteBuf + "] sampleType=[" + sampleType + "]");
        }
        if ((bufferInfo.flags & 4) != 0) {
            int i14 = l0.f60042a[sampleType.ordinal()];
            if (i14 == 1) {
                this.f60052g = true;
            } else if (i14 == 2) {
                this.f60053h = true;
            }
        } else if (!byteBuf.hasRemaining()) {
            return;
        }
        jg1.v vVar = this.f60047b;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(sampleType, "sampleType");
        Intrinsics.checkNotNullParameter(byteBuf, "byteBuf");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (vVar.f76072h) {
            kt1.b bVar = (kt1.b) vVar.f76073i;
            int i15 = k0.f60041a[sampleType.ordinal()];
            if (i15 == 1) {
                i13 = vVar.f76068d;
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = vVar.f76069e;
            }
            bVar.b(i13, bufferInfo, byteBuf);
            return;
        }
        byteBuf.limit(bufferInfo.offset + bufferInfo.size);
        byteBuf.position(bufferInfo.offset);
        if (((ByteBuffer) vVar.f76070f) == null) {
            vVar.f76070f = ByteBuffer.allocateDirect(65536).order(ByteOrder.nativeOrder());
        }
        ByteBuffer byteBuffer = (ByteBuffer) vVar.f76070f;
        if (byteBuffer != null) {
            byteBuffer.put(byteBuf);
        }
        ((List) vVar.f76071g).add(new i0(sampleType, bufferInfo.size, bufferInfo));
    }

    public final String toString() {
        return "MuxRenderAutoSetup=[started=[" + this.f60050e + "] setVideoFormat=[" + this.f60048c + "] setAudioFormat=[" + this.f60049d + "] muxRender=[" + this.f60047b + "]]";
    }
}
