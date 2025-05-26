package bb;

import java.lang.reflect.InvocationTargetException;
import kh2.j1;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final m f22459a;

    static {
        m eVar;
        try {
            eVar = new t5.e((WebViewProviderFactoryBoundaryInterface) lp2.b.b(WebViewProviderFactoryBoundaryInterface.class, j1.Z()), 28);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException e13) {
            e = e13;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e14) {
            e = e14;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e15) {
            e = e15;
            throw new RuntimeException(e);
        }
        f22459a = eVar;
    }
}
