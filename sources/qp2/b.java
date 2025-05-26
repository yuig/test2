package qp2;

import java.io.File;
import kv0.p;
import mp2.f;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import sd.e;

/* loaded from: classes4.dex */
public final class b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static e f104857c;

    /* renamed from: a, reason: collision with root package name */
    public File f104858a;

    /* renamed from: b, reason: collision with root package name */
    public p f104859b;

    public final void a() {
        if (this.f104858a == null) {
            throw new MqttPersistenceException();
        }
    }

    public final File[] c() {
        a();
        File file = this.f104858a;
        if (f104857c == null) {
            f104857c = new e(".msg", 2);
        }
        File[] listFiles = file.listFiles(f104857c);
        if (listFiles != null) {
            return listFiles;
        }
        throw new MqttPersistenceException();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                p pVar = this.f104859b;
                if (pVar != null) {
                    pVar.j();
                }
                if (c().length == 0) {
                    this.f104858a.delete();
                }
                this.f104858a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
