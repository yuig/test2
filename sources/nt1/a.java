package nt1;

import android.media.MediaFormat;
import ft1.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final MediaFormat f92292a;

    public a(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        this.f92292a = mediaFormat;
    }

    @Override // nt1.c
    public final long a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f92292a.getLong(key);
    }

    @Override // nt1.c
    public final Integer b() {
        MediaFormat mediaFormat = this.f92292a;
        if (mediaFormat.containsKey("sample-rate")) {
            return Integer.valueOf(mediaFormat.getInteger("sample-rate"));
        }
        return null;
    }

    @Override // nt1.c
    public final String c() {
        return this.f92292a.getString("mime");
    }

    @Override // nt1.c
    public final String d(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f92292a.getString(key);
    }

    @Override // nt1.c
    public final int e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f92292a.getInteger(key);
    }

    @Override // nt1.c
    public final Integer f() {
        MediaFormat mediaFormat = this.f92292a;
        if (mediaFormat.containsKey("channel-mask")) {
            return Integer.valueOf(mediaFormat.getInteger("channel-mask"));
        }
        if (mediaFormat.containsKey("channel-count")) {
            int integer = mediaFormat.getInteger("channel-count");
            if (integer == 1) {
                return 16;
            }
            if (integer == 2) {
                return 12;
            }
        }
        return null;
    }

    @Override // nt1.c
    public final i g() {
        if (w("pcm-encoding")) {
            return l3.c.j(e("pcm-encoding"));
        }
        if (z.i("audio/raw", c(), true)) {
            return i.Short;
        }
        return null;
    }

    @Override // nt1.c
    public final Integer h() {
        MediaFormat mediaFormat = this.f92292a;
        if (mediaFormat.containsKey("channel-count")) {
            return Integer.valueOf(mediaFormat.getInteger("channel-count"));
        }
        return null;
    }

    public final String toString() {
        String mediaFormat = this.f92292a.toString();
        Intrinsics.checkNotNullExpressionValue(mediaFormat, "toString(...)");
        return mediaFormat;
    }

    @Override // nt1.c
    public final boolean w(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f92292a.containsKey(key);
    }
}
