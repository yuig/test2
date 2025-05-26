package b7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

/* loaded from: classes.dex */
public final class j extends g {
    @Override // b7.g
    public final e a(e eVar) {
        int i13 = eVar.f22040c;
        if (i13 == 3 || i13 == 2 || i13 == 268435456 || i13 == 21 || i13 == 1342177280 || i13 == 22 || i13 == 1610612736 || i13 == 4) {
            return i13 != 2 ? new e(eVar.f22038a, eVar.f22039b, 2) : e.f22037e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e4->B:43:0x00e6, LOOP_START, PHI: r0
      0x00e4: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003e, B:43:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // b7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.j.f(java.nio.ByteBuffer):void");
    }
}
