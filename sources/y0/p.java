package y0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import kh2.j1;
import kh2.m0;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f136351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f136352c;

    public /* synthetic */ p(c0 c0Var, long j13, int i13) {
        this.f136350a = i13;
        this.f136351b = c0Var;
        this.f136352c = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f136350a) {
            case 0:
                c0 c0Var = this.f136351b;
                switch (c0Var.f136296t.ordinal()) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j13 = this.f136352c;
                        m0.p(c0Var.f136277a, "Pause on ".concat(j1.m1(j13)));
                        c0Var.f136291o.addLast(Range.create(Long.valueOf(j13), Long.MAX_VALUE));
                        c0Var.i(y.PAUSED);
                        return;
                    case 4:
                        c0Var.i(y.PENDING_START_PAUSED);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + c0Var.f136296t);
                }
            default:
                c0 c0Var2 = this.f136351b;
                long j14 = this.f136352c;
                switch (c0Var2.f136296t.ordinal()) {
                    case 0:
                        c0Var2.f136300x = null;
                        m0.p(c0Var2.f136277a, "Start on ".concat(j1.m1(j14)));
                        try {
                            if (c0Var2.A) {
                                c0Var2.h();
                            }
                            c0Var2.f136297u = Range.create(Long.valueOf(j14), Long.MAX_VALUE);
                            c0Var2.f136281e.start();
                            k kVar = c0Var2.f136282f;
                            if (kVar instanceof x) {
                                ((x) kVar).b(true);
                            }
                            c0Var2.i(y.STARTED);
                            return;
                        } catch (MediaCodec.CodecException e13) {
                            c0Var2.b(1, e13.getMessage(), e13);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        c0Var2.f136300x = null;
                        Range range = (Range) c0Var2.f136291o.removeLast();
                        com.bumptech.glide.d.v("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                        Long l13 = (Long) range.getLower();
                        long longValue = l13.longValue();
                        c0Var2.f136291o.addLast(Range.create(l13, Long.valueOf(j14)));
                        m0.p(c0Var2.f136277a, "Resume on " + j1.m1(j14) + "\nPaused duration = " + j1.m1(j14 - longValue));
                        if ((c0Var2.f136279c || w0.a.f126951a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!c0Var2.f136279c || w0.a.f126951a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("drop-input-frames", 0);
                            c0Var2.f136281e.setParameters(bundle);
                            k kVar2 = c0Var2.f136282f;
                            if (kVar2 instanceof x) {
                                ((x) kVar2).b(true);
                            }
                        }
                        if (c0Var2.f136279c) {
                            c0Var2.g();
                        }
                        c0Var2.i(y.STARTED);
                        return;
                    case 3:
                    case 5:
                        c0Var2.i(y.PENDING_START);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + c0Var2.f136296t);
                }
        }
    }
}
