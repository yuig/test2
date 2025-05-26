package jg1;

import android.content.Context;
import android.graphics.PointF;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import et1.i0;
import et1.k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76065a = 2;

    /* renamed from: b, reason: collision with root package name */
    public Object f76066b;

    /* renamed from: c, reason: collision with root package name */
    public Object f76067c;

    /* renamed from: d, reason: collision with root package name */
    public int f76068d;

    /* renamed from: e, reason: collision with root package name */
    public int f76069e;

    /* renamed from: f, reason: collision with root package name */
    public Object f76070f;

    /* renamed from: g, reason: collision with root package name */
    public Object f76071g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f76072h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f76073i;

    public v(Context context, o62.a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f76073i = context;
        this.f76066b = listener;
        this.f76067c = new PointF();
        this.f76070f = new PointF();
        this.f76071g = new PointF();
        this.f76068d = -1;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f76069e = scaledTouchSlop * scaledTouchSlop;
    }

    public final void a() {
        int i13;
        int i14;
        int i15 = this.f76065a;
        int i16 = 0;
        Object obj = this.f76073i;
        switch (i15) {
            case 0:
                MediaFormat mediaFormat = (MediaFormat) this.f76066b;
                if (mediaFormat != null) {
                    this.f76068d = ((MediaMuxer) obj).addTrack(mediaFormat);
                    mediaFormat.getString("mime");
                }
                MediaFormat mediaFormat2 = (MediaFormat) this.f76067c;
                if (mediaFormat2 != null) {
                    this.f76069e = ((MediaMuxer) obj).addTrack(mediaFormat2);
                    mediaFormat2.getString("mime");
                }
                MediaMuxer mediaMuxer = (MediaMuxer) obj;
                mediaMuxer.start();
                this.f76072h = true;
                if (((ByteBuffer) this.f76070f) == null) {
                    this.f76070f = ByteBuffer.allocate(0);
                }
                ByteBuffer byteBuffer = (ByteBuffer) this.f76070f;
                if (byteBuffer != null) {
                    byteBuffer.flip();
                    ((List) this.f76071g).size();
                    byteBuffer.limit();
                }
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                for (s sVar : (List) this.f76071g) {
                    sVar.getClass();
                    Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
                    int i17 = i16;
                    bufferInfo.set(i17, sVar.f76061b, sVar.f76062c, sVar.f76063d);
                    int i18 = u.f76064a[sVar.f76060a.ordinal()];
                    if (i18 == 1) {
                        i13 = this.f76068d;
                    } else {
                        if (i18 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i13 = this.f76069e;
                    }
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.f76070f;
                    Intrinsics.f(byteBuffer2);
                    mediaMuxer.writeSampleData(i13, byteBuffer2, bufferInfo);
                    i16 += sVar.f76061b;
                }
                ((List) this.f76071g).clear();
                this.f76070f = null;
                return;
            default:
                MediaFormat mediaFormat3 = (MediaFormat) this.f76066b;
                if (mediaFormat3 != null) {
                    this.f76068d = ((kt1.b) obj).c(mediaFormat3);
                    mediaFormat3.getString("mime");
                }
                MediaFormat mediaFormat4 = (MediaFormat) this.f76067c;
                if (mediaFormat4 != null) {
                    this.f76069e = ((kt1.b) obj).c(mediaFormat4);
                    mediaFormat4.getString("mime");
                }
                kt1.b bVar = (kt1.b) obj;
                bVar.start();
                this.f76072h = true;
                if (((ByteBuffer) this.f76070f) == null) {
                    this.f76070f = ByteBuffer.allocate(0);
                }
                ByteBuffer byteBuffer3 = (ByteBuffer) this.f76070f;
                if (byteBuffer3 != null) {
                    byteBuffer3.flip();
                    ((List) this.f76071g).size();
                    byteBuffer3.limit();
                }
                MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                for (i0 i0Var : (List) this.f76071g) {
                    i0Var.getClass();
                    Intrinsics.checkNotNullParameter(bufferInfo2, "bufferInfo");
                    int i19 = i16;
                    bufferInfo2.set(i19, i0Var.f60030b, i0Var.f60031c, i0Var.f60032d);
                    int i23 = k0.f60041a[i0Var.f60029a.ordinal()];
                    if (i23 == 1) {
                        i14 = this.f76068d;
                    } else {
                        if (i23 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i14 = this.f76069e;
                    }
                    ByteBuffer byteBuffer4 = (ByteBuffer) this.f76070f;
                    Intrinsics.f(byteBuffer4);
                    bVar.b(i14, bufferInfo2, byteBuffer4);
                    i16 += i0Var.f60030b;
                }
                ((List) this.f76071g).clear();
                this.f76070f = null;
                return;
        }
    }

    public final void b(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f76072h = false;
            this.f76068d = event.getPointerId(0);
            this.f76070f = kg.t.K(event);
            this.f76071g = kg.t.K(event);
            this.f76067c = new PointF();
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = event.findPointerIndex(this.f76068d);
                Integer valueOf = Integer.valueOf(findPointerIndex);
                if (findPointerIndex == -1) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    PointF pointF = new PointF(event.getX(intValue), event.getY(intValue));
                    PointF pointF2 = (PointF) this.f76071g;
                    PointF pointF3 = new PointF(pointF.x, pointF.y);
                    pointF3.offset(-pointF2.x, -pointF2.y);
                    this.f76067c = pointF3;
                    this.f76071g = pointF;
                    PointF pointF4 = (PointF) this.f76070f;
                    PointF pointF5 = new PointF(pointF.x, pointF.y);
                    pointF5.offset(-pointF4.x, -pointF4.y);
                    float f13 = pointF5.x;
                    float f14 = pointF5.y;
                    if ((f14 * f14) + (f13 * f13) > this.f76069e) {
                        this.f76072h = !this.f76072h ? ((o62.a) this.f76066b).c(this) : ((o62.a) this.f76066b).a(this);
                        return;
                    }
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 6 && event.getPointerId(event.getActionIndex()) == this.f76068d) {
                    int i13 = event.getActionIndex() == 0 ? 1 : 0;
                    this.f76071g = new PointF(event.getX(i13), event.getY(i13));
                    this.f76067c = new PointF();
                    this.f76068d = event.getPointerId(i13);
                    return;
                }
                return;
            }
        }
        if (this.f76072h) {
            ((o62.a) this.f76066b).b(this);
        }
        this.f76072h = false;
        this.f76068d = -1;
        this.f76071g = new PointF();
        this.f76067c = new PointF();
    }

    public final void c(t sampleType, ByteBuffer byteBuf, MediaCodec.BufferInfo bufferInfo) {
        int i13;
        Intrinsics.checkNotNullParameter(sampleType, "sampleType");
        Intrinsics.checkNotNullParameter(byteBuf, "byteBuf");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (this.f76072h) {
            MediaMuxer mediaMuxer = (MediaMuxer) this.f76073i;
            int i14 = u.f76064a[sampleType.ordinal()];
            if (i14 == 1) {
                i13 = this.f76068d;
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = this.f76069e;
            }
            mediaMuxer.writeSampleData(i13, byteBuf, bufferInfo);
            return;
        }
        byteBuf.limit(bufferInfo.offset + bufferInfo.size);
        byteBuf.position(bufferInfo.offset);
        if (((ByteBuffer) this.f76070f) == null) {
            this.f76070f = ByteBuffer.allocateDirect(65536).order(ByteOrder.nativeOrder());
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f76070f;
        if (byteBuffer != null) {
            byteBuffer.put(byteBuf);
        }
        ((List) this.f76071g).add(new s(sampleType, bufferInfo.size, bufferInfo));
    }

    public v(MediaMuxer muxer) {
        Intrinsics.checkNotNullParameter(muxer, "muxer");
        this.f76073i = muxer;
        this.f76071g = new ArrayList();
    }

    public v(kt1.e muxer) {
        Intrinsics.checkNotNullParameter(muxer, "muxer");
        this.f76073i = muxer;
        this.f76071g = new ArrayList();
    }
}
