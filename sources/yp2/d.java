package yp2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a */
    public final Object f139620a;

    public d(OutputStream outputStream) {
        this.f139620a = outputStream;
    }

    public final void a(b bVar) {
        ((Vector) this.f139620a).addElement(bVar);
    }

    public h b() {
        return new h((OutputStream) this.f139620a);
    }

    public final void c(int i13) {
        ((OutputStream) this.f139620a).write(i13);
    }

    public final void d(int i13) {
        if (i13 <= 127) {
            c((byte) i13);
            return;
        }
        int i14 = i13;
        int i15 = 1;
        while (true) {
            i14 >>>= 8;
            if (i14 == 0) {
                break;
            } else {
                i15++;
            }
        }
        c((byte) (i15 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
        for (int i16 = (i15 - 1) * 8; i16 >= 0; i16 -= 8) {
            c((byte) (i13 >> i16));
        }
    }

    public void e(b bVar) {
        if (bVar == null) {
            throw new IOException("null object detected");
        }
        bVar.b().d(this);
    }

    public d() {
        this.f139620a = new Vector();
    }
}
