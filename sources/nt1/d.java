package nt1;

import android.media.MediaFormat;
import et1.j0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import ql2.s;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final e f92294a = new e(1, 1000000);

    public static final ByteBuffer a(int i13) {
        ByteBuffer allocate = ByteBuffer.allocate(i13);
        allocate.order(ByteOrder.nativeOrder());
        return allocate;
    }

    public static final byte[] b(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (!byteBuffer.hasArray()) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return bArr;
        }
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int remaining = byteBuffer.remaining() + arrayOffset;
        byte[] array = byteBuffer.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return c0.S(array, s.q(arrayOffset, remaining));
    }

    public static final String c(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        return mediaFormat.getString("mime");
    }

    public static final j0 d(String str) {
        if (str == null) {
            return null;
        }
        if (z.p(str, "audio/", true)) {
            return j0.AUDIO;
        }
        if (z.p(str, "video/", true)) {
            return j0.VIDEO;
        }
        return null;
    }

    public static final boolean e(String str) {
        return d(str) == j0.AUDIO;
    }

    public static final void f(int i13, ByteBuffer byteBuffer, ByteBuffer source) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (Intrinsics.d(source.order(), byteBuffer.order()) || i13 <= 1) {
            byteBuffer.put(source);
            return;
        }
        while (source.remaining() >= i13) {
            int position = source.position();
            for (int i14 = i13 - 1; -1 < i14; i14--) {
                byteBuffer.put(source.get(position + i14));
            }
            source.position(position + i13);
        }
    }

    public static final long g(long j13, e fromClockPeriod, e toClockPeriod) {
        Intrinsics.checkNotNullParameter(fromClockPeriod, "fromClockPeriod");
        Intrinsics.checkNotNullParameter(toClockPeriod, "toClockPeriod");
        return ml2.c.d((fromClockPeriod.a() * j13) / toClockPeriod.a());
    }
}
