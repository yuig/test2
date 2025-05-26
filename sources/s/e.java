package s;

import android.os.Bundle;
import android.os.Parcel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import oi.o6;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f110251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f110252c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f110253d;

    public /* synthetic */ e(Object obj, String str, Bundle bundle, int i13) {
        this.f110250a = i13;
        this.f110253d = obj;
        this.f110251b = str;
        this.f110252c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f110250a) {
            case 0:
                ((j) this.f110253d).f110276b.extraCallback(this.f110251b, this.f110252c);
                return;
            default:
                p000do.b bVar = (p000do.b) this.f110253d;
                String str = this.f110251b;
                Bundle bundle = this.f110252c;
                bVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeBundle(bundle);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                w6.b bVar2 = bVar.f55642a;
                bVar2.f128107a.put(str, marshall);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File((File) bVar2.f128109c, str));
                    try {
                        fileOutputStream.write(marshall);
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                        throw th3;
                    }
                    fileOutputStream.close();
                } catch (FileNotFoundException | IOException unused3) {
                }
                if (!((p000do.b) this.f110253d).f55645d.containsKey(this.f110251b)) {
                    p000do.b bVar3 = (p000do.b) this.f110253d;
                    String str2 = this.f110251b;
                    bVar3.getClass();
                    bVar3.f55643b.execute(new o6(7, bVar3, str2));
                }
                ((p000do.b) this.f110253d).f55644c.remove(this);
                if (!((p000do.b) this.f110253d).f55644c.isEmpty() || ((p000do.b) this.f110253d).f55652k == null) {
                    return;
                }
                ((p000do.b) this.f110253d).f55652k.countDown();
                return;
        }
    }
}
