package com.modiface.mfemakeupkit.video;

import android.media.AudioRecord;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private AudioRecord f34684a = null;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final p f34685b;

    public c(@NonNull p pVar) {
        this.f34685b = pVar;
    }

    public boolean a() {
        if (this.f34684a != null) {
            return false;
        }
        int minBufferSize = AudioRecord.getMinBufferSize(this.f34685b.f34754h, 16, 2);
        p pVar = this.f34685b;
        int i13 = pVar.f34756j;
        int i14 = pVar.f34757k * i13;
        if (i14 < minBufferSize) {
            i14 = ((minBufferSize / i13) + 1) * i13 * 2;
        }
        for (int i15 : pVar.f34760n) {
            try {
                AudioRecord audioRecord = new AudioRecord(i15, this.f34685b.f34754h, 16, 2, i14);
                this.f34684a = audioRecord;
                if (audioRecord.getState() != 1) {
                    this.f34684a = null;
                }
            } catch (Exception unused) {
                this.f34684a = null;
            }
            AudioRecord audioRecord2 = this.f34684a;
            if (audioRecord2 != null) {
                try {
                    audioRecord2.startRecording();
                } catch (IllegalStateException unused2) {
                    this.f34684a = null;
                }
            }
            if (this.f34684a != null) {
                break;
            }
        }
        return this.f34684a != null;
    }

    public void b() {
        AudioRecord audioRecord = this.f34684a;
        if (audioRecord != null) {
            audioRecord.release();
            this.f34684a = null;
        }
    }

    public int a(g gVar) {
        if (gVar == null || !gVar.a()) {
            return -2;
        }
        AudioRecord audioRecord = this.f34684a;
        if (audioRecord != null) {
            int read = audioRecord.read(gVar.f34712b, this.f34685b.f34756j);
            if (read > 0) {
                gVar.f34712b.position(read);
                gVar.f34712b.flip();
            }
            return read;
        }
        gVar.f34712b.put(new byte[this.f34685b.f34756j]);
        gVar.f34712b.flip();
        return this.f34685b.f34756j;
    }
}
