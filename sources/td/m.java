package td;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;
import kh2.a1;

/* loaded from: classes3.dex */
public final class m implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f117417a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f117418b;

    /* renamed from: c, reason: collision with root package name */
    public final n f117419c;

    /* renamed from: d, reason: collision with root package name */
    public final int f117420d;

    /* renamed from: e, reason: collision with root package name */
    public Object f117421e;

    public m(Resources.Theme theme, Resources resources, n nVar, int i13) {
        this.f117417a = theme;
        this.f117418b = resources;
        this.f117419c = nVar;
        this.f117420d = i13;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (((l) this.f117419c).f117414a) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        Object obj = this.f117421e;
        if (obj != null) {
            try {
                switch (((l) this.f117419c).f117414a) {
                    case 0:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
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
        Object openRawResourceFd;
        try {
            n nVar = this.f117419c;
            Resources.Theme theme = this.f117417a;
            Resources resources = this.f117418b;
            int i13 = this.f117420d;
            l lVar = (l) nVar;
            switch (lVar.f117414a) {
                case 0:
                    openRawResourceFd = resources.openRawResourceFd(i13);
                    break;
                case 1:
                    Context context = lVar.f117415b;
                    openRawResourceFd = a1.C(context, context, i13, theme);
                    break;
                default:
                    openRawResourceFd = resources.openRawResource(i13);
                    break;
            }
            this.f117421e = openRawResourceFd;
            dVar.f(openRawResourceFd);
        } catch (Resources.NotFoundException e13) {
            dVar.d(e13);
        }
    }
}
