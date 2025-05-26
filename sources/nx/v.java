package nx;

import java.util.List;

/* loaded from: classes.dex */
public interface v {
    default List getChildImpressionViews() {
        return null;
    }

    Object markImpressionEnd();

    Object markImpressionStart();
}
