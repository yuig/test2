package com.modiface.mfemakeupkit.video;

import android.media.MediaCodecInfo;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public final class q extends f {

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final p f34761f;

    /* renamed from: g, reason: collision with root package name */
    MediaCodecInfo.CodecCapabilities f34762g = null;

    public q(@NonNull p pVar) {
        this.f34761f = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.media.MediaCodecInfo.CodecCapabilities b(java.lang.String r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            int r1 = android.media.MediaCodecList.getCodecCount()
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L49
            android.media.MediaCodecInfo r4 = android.media.MediaCodecList.getCodecInfoAt(r3)
            if (r4 == 0) goto L46
            boolean r5 = r4.isEncoder()
            if (r5 != 0) goto L19
            goto L46
        L19:
            java.lang.String[] r5 = r4.getSupportedTypes()
            if (r5 != 0) goto L20
            goto L46
        L20:
            r6 = r2
        L21:
            int r7 = r5.length
            if (r6 >= r7) goto L46
            r7 = r5[r6]
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L43
            android.media.MediaCodecInfo$CodecCapabilities r4 = r4.getCapabilitiesForType(r8)
            if (r4 == 0) goto L46
            r5 = r2
        L33:
            int[] r6 = r4.colorFormats
            int r7 = r6.length
            if (r5 >= r7) goto L46
            r6 = r6[r5]
            r7 = 2130708361(0x7f000789, float:1.701803E38)
            if (r6 != r7) goto L40
            return r4
        L40:
            int r5 = r5 + 1
            goto L33
        L43:
            int r6 = r6 + 1
            goto L21
        L46:
            int r3 = r3 + 1
            goto La
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.modiface.mfemakeupkit.video.q.b(java.lang.String):android.media.MediaCodecInfo$CodecCapabilities");
    }

    public void a(int i13, int i14) {
        super.a(this.f34761f.a(i13, i14, this.f34762g), true);
    }

    public g h() {
        return super.a(this.f34761f.f34752f);
    }

    public void i() {
        MediaCodecInfo.CodecCapabilities b13 = b(this.f34761f.f34747a);
        this.f34762g = b13;
        if (b13 == null) {
            return;
        }
        super.a(this.f34761f.f34747a);
    }
}
