package nc2;

import a7.i1;
import ac2.e0;
import android.util.SizeF;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface g {
    default void A(SizeF viewDimensions, long j13, long j14) {
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
    }

    default void B(SizeF viewDimensions, long j13, long j14) {
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
    }

    default void C(long j13) {
    }

    default void G(long j13) {
    }

    default void I(SizeF dimensions, long j13, long j14) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
    }

    default void L(int i13) {
    }

    default void M(i0 thriftContext) {
        Intrinsics.checkNotNullParameter(thriftContext, "thriftContext");
    }

    default void N(int i13, Exception exc) {
    }

    default void b(long j13) {
    }

    default void c(long j13, long j14) {
    }

    default void d(int i13, int i14, String sourceUrl) {
        Intrinsics.checkNotNullParameter(sourceUrl, "sourceUrl");
    }

    default void e(long j13, long j14, e0 playerDisconnectReason) {
        Intrinsics.checkNotNullParameter(playerDisconnectReason, "playerDisconnectReason");
    }

    default void i(qc2.c viewability, boolean z13, long j13, long j14) {
        Intrinsics.checkNotNullParameter(viewability, "viewability");
    }

    default void j(long j13) {
    }

    default void k(i1 tracks) {
        Intrinsics.checkNotNullParameter(tracks, "tracks");
    }

    default void n(long j13, boolean z13) {
    }

    default void r(int i13, boolean z13, long j13, long j14, ic2.b handleChange) {
        Intrinsics.checkNotNullParameter(handleChange, "handleChange");
    }

    default void t(long j13, long j14) {
    }

    default void u(long j13, long j14) {
    }

    default void v(long j13) {
    }

    default void w(androidx.media3.common.b format) {
        Intrinsics.checkNotNullParameter(format, "format");
    }

    default void x(long j13, long j14) {
    }

    default void y() {
    }

    default void z(float f13) {
    }
}
