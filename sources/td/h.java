package td;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class h implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final File f117393a;

    public h(File file) {
        this.f117393a = file;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final nd.a c() {
        return nd.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        try {
            dVar.f(he.c.a(this.f117393a));
        } catch (IOException e13) {
            if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e13);
            }
            dVar.d(e13);
        }
    }
}
