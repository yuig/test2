package androidx.appcompat.app;

import android.widget.ArrayAdapter;

/* loaded from: classes2.dex */
public final class h extends ArrayAdapter {
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
