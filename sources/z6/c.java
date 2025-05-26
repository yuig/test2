package z6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.measurement.q4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f140880f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static c f140881g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f140882a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f140883b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f140884c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f140885d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final a f140886e;

    public c(Context context) {
        this.f140882a = context;
        this.f140886e = new a(this, context.getMainLooper(), 0);
    }

    public static c a(Context context) {
        c cVar;
        synchronized (f140880f) {
            try {
                if (f140881g == null) {
                    f140881g = new c(context.getApplicationContext());
                }
                cVar = f140881g;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f140883b) {
            try {
                b bVar = new b(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f140883b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f140883b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(bVar);
                for (int i13 = 0; i13 < intentFilter.countActions(); i13++) {
                    String action = intentFilter.getAction(i13);
                    ArrayList arrayList2 = (ArrayList) this.f140884c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f140884c.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final void c(Intent intent) {
        ArrayList arrayList;
        int i13;
        String str;
        ?? r122;
        synchronized (this.f140883b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f140882a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                int i14 = 1;
                boolean z13 = false;
                boolean z14 = (intent.getFlags() & 8) != 0;
                if (z14) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f140884c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z14) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i15 = 0;
                    while (i15 < arrayList2.size()) {
                        b bVar = (b) arrayList2.get(i15);
                        if (z14) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f140876a);
                        }
                        if (bVar.f140878c) {
                            if (z14) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                            i13 = i15;
                            str = action;
                            r122 = i14;
                        } else {
                            String str2 = action;
                            arrayList = arrayList2;
                            i13 = i15;
                            str = action;
                            r122 = i14;
                            int match = bVar.f140876a.match(str2, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z14) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(bVar);
                                bVar.f140878c = r122;
                            } else if (z14) {
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                            }
                        }
                        i15 = i13 + 1;
                        i14 = r122;
                        arrayList2 = arrayList;
                        action = str;
                        z13 = false;
                    }
                    int i16 = i14;
                    if (arrayList3 != null) {
                        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                            ((b) arrayList3.get(i17)).f140878c = false;
                        }
                        this.f140885d.add(new q4(14, intent, arrayList3));
                        if (!this.f140886e.hasMessages(i16)) {
                            this.f140886e.sendEmptyMessage(i16);
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f140883b) {
            try {
                ArrayList arrayList = (ArrayList) this.f140883b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b bVar = (b) arrayList.get(size);
                    bVar.f140879d = true;
                    for (int i13 = 0; i13 < bVar.f140876a.countActions(); i13++) {
                        String action = bVar.f140876a.getAction(i13);
                        ArrayList arrayList2 = (ArrayList) this.f140884c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                b bVar2 = (b) arrayList2.get(size2);
                                if (bVar2.f140877b == broadcastReceiver) {
                                    bVar2.f140879d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f140884c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
