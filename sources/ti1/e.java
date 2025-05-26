package ti1;

import com.pinterest.ui.grid.LegoPinGridCell;
import kotlin.NoWhenBranchMatchedException;
import qa2.h0;

/* loaded from: classes5.dex */
public interface e {
    default h0 a() {
        if (this instanceof c) {
            return ((c) this).f117707a;
        }
        if (this instanceof d) {
            return ((d) this).f117708a;
        }
        throw new NoWhenBranchMatchedException();
    }

    default LegoPinGridCell getView() {
        if (this instanceof c) {
            return ((c) this).f117707a;
        }
        if (this instanceof d) {
            return ((d) this).f117708a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
