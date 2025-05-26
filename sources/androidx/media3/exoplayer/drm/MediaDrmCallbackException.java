package androidx.media3.exoplayer.drm;

import android.net.Uri;
import g7.i;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MediaDrmCallbackException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final Map f18808a;

    public MediaDrmCallbackException(i iVar, Uri uri, Map map, long j13, Exception exc) {
        super(exc);
        this.f18808a = map;
    }
}
