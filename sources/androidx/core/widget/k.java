package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class k implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f18009a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f18010b;

    /* renamed from: c, reason: collision with root package name */
    public Class f18011c;

    /* renamed from: d, reason: collision with root package name */
    public Method f18012d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18013e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18014f = false;

    public k(ActionMode.Callback callback, TextView textView) {
        this.f18009a = callback;
        this.f18010b = textView;
    }

    public final ActionMode.Callback a() {
        return this.f18009a;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f18009a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f18009a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f18009a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        TextView textView = this.f18010b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f18014f) {
            this.f18014f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f18011c = cls;
                this.f18012d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f18013e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f18011c = null;
                this.f18012d = null;
                this.f18013e = false;
            }
        }
        try {
            Method declaredMethod = (this.f18013e && this.f18011c.isInstance(menu)) ? this.f18012d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i13);
                MenuItem add = menu.add(0, 0, i13 + 100, resolveInfo2.loadLabel(packageManager));
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f18009a.onPrepareActionMode(actionMode, menu);
    }
}
