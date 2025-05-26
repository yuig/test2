package za0;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class e {
    public static CutoutPickerOrigin a(int i13) {
        Object obj;
        Iterator<E> it = CutoutPickerOrigin.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CutoutPickerOrigin) obj).ordinal() == i13) {
                break;
            }
        }
        CutoutPickerOrigin cutoutPickerOrigin = (CutoutPickerOrigin) obj;
        return cutoutPickerOrigin == null ? CutoutPickerOrigin.None : cutoutPickerOrigin;
    }
}
