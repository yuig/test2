package wd;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class d0 implements nd.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129162a;

    public /* synthetic */ d0(int i13) {
        this.f129162a = i13;
    }

    @Override // nd.n
    public final /* bridge */ /* synthetic */ boolean a(Object obj, nd.l lVar) {
        switch (this.f129162a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // nd.n
    public final pd.g0 b(Object obj, int i13, int i14, nd.l lVar) {
        switch (this.f129162a) {
            case 0:
                return new c0((Bitmap) obj, 0);
            case 1:
                return xd.d.e((Drawable) obj);
            default:
                return new c0((File) obj);
        }
    }
}
