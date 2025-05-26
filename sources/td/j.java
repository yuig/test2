package td;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class j implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117404a;

    /* renamed from: b, reason: collision with root package name */
    public Object f117405b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f117406c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f117407d;

    public /* synthetic */ j(int i13, Object obj, Object obj2) {
        this.f117404a = i13;
        this.f117406c = obj;
        this.f117407d = obj2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        int i13 = this.f117404a;
        Object obj = this.f117407d;
        switch (i13) {
            case 0:
                ((rd.j) obj).getClass();
                return InputStream.class;
            default:
                return ((r) obj).a();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        int i13 = this.f117404a;
        Object obj = this.f117407d;
        switch (i13) {
            case 0:
                try {
                    Object obj2 = this.f117405b;
                    ((rd.j) obj).getClass();
                    ((InputStream) obj2).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
            default:
                Object obj3 = this.f117405b;
                if (obj3 != null) {
                    try {
                        ((r) obj).k(obj3);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final nd.a c() {
        switch (this.f117404a) {
        }
        return nd.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        int i13 = this.f117404a;
        Object obj = this.f117406c;
        Object obj2 = this.f117407d;
        switch (i13) {
            case 0:
                try {
                    ((rd.j) obj2).getClass();
                    ByteArrayInputStream f13 = rd.j.f((String) obj);
                    this.f117405b = f13;
                    dVar.f(f13);
                    break;
                } catch (IllegalArgumentException e13) {
                    dVar.d(e13);
                }
            default:
                try {
                    Object c13 = ((r) obj2).c((File) obj);
                    this.f117405b = c13;
                    dVar.f(c13);
                    break;
                } catch (FileNotFoundException e14) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e14);
                    }
                    dVar.d(e14);
                    return;
                }
        }
    }
}
