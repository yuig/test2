package hf2;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import info.mqtt.android.service.MqttService;
import info.mqtt.android.service.ParcelableMqttMessage;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        mp2.c cVar;
        Object obj4;
        Object parcelable;
        Bundle p03 = (Bundle) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        e eVar = (e) this.receiver;
        String str = e.f69016o;
        eVar.getClass();
        t72.j jVar = tq2.a.f119026a;
        p03.toString();
        jVar.getClass();
        t72.j.q(new Object[0]);
        String string = p03.getString(".clientHandle");
        if (string != null && Intrinsics.d(string, eVar.f69025i)) {
            String string2 = p03.getString(".callbackAction");
            if (Intrinsics.d("connect", string2)) {
                n nVar = eVar.f69028l;
                Intrinsics.f(nVar);
                p03.getBoolean("sessionPresent");
                nVar.getClass();
                eVar.e(p03);
                eVar.f(nVar, p03);
            } else if (Intrinsics.d("connectExtended", string2)) {
                boolean z13 = p03.getBoolean(".reconnect", false);
                String string3 = p03.getString(".serverURI");
                Iterator it = eVar.f69029m.iterator();
                while (it.hasNext()) {
                    mp2.e eVar2 = (mp2.e) it.next();
                    if (eVar2 instanceof mp2.e) {
                        eVar2.c(string3, z13);
                    }
                }
            } else {
                if (Intrinsics.d("messageArrived", string2)) {
                    String string4 = p03.getString("messageId");
                    Intrinsics.f(string4);
                    String string5 = p03.getString("destinationName");
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = p03.getParcelable(".PARCEL", ParcelableMqttMessage.class);
                        obj4 = (Parcelable) parcelable;
                    } else {
                        Object parcelable2 = p03.getParcelable(".PARCEL");
                        obj4 = (ParcelableMqttMessage) (parcelable2 instanceof ParcelableMqttMessage ? parcelable2 : null);
                    }
                    Intrinsics.f(obj4);
                    ParcelableMqttMessage parcelableMqttMessage = (ParcelableMqttMessage) obj4;
                    try {
                        a aVar = eVar.f69023g;
                        a aVar2 = a.AUTO_ACK;
                        ArrayList arrayList = eVar.f69029m;
                        if (aVar == aVar2) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((mp2.e) it2.next()).b(string5, parcelableMqttMessage);
                            }
                            MqttService mqttService = eVar.f69024h;
                            Intrinsics.f(mqttService);
                            String str2 = eVar.f69025i;
                            Intrinsics.f(str2);
                            mqttService.a(str2, string4);
                        } else {
                            parcelableMqttMessage.f72901e = string4;
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                ((mp2.e) it3.next()).b(string5, parcelableMqttMessage);
                            }
                        }
                    } catch (Exception e13) {
                        t72.j jVar2 = tq2.a.f119026a;
                        e13.toString();
                        jVar2.getClass();
                        t72.j.j(new Object[0]);
                        MqttService mqttService2 = eVar.f69024h;
                        Intrinsics.f(mqttService2);
                        mqttService2.j("messageArrivedAction failed: " + e13);
                    }
                } else if (Intrinsics.d("subscribe", string2)) {
                    eVar.f(eVar.e(p03), p03);
                } else if (Intrinsics.d("unsubscribe", string2)) {
                    eVar.f(eVar.e(p03), p03);
                } else if (Intrinsics.d("send", string2)) {
                    synchronized (eVar) {
                        String string6 = p03.getString(".activityToken");
                        SparseArray sparseArray = eVar.f69022f;
                        Intrinsics.f(string6);
                        cVar = (mp2.c) sparseArray.get(Integer.parseInt(string6));
                    }
                    eVar.f(cVar, p03);
                } else if (Intrinsics.d("messageDelivered", string2)) {
                    mp2.c e14 = eVar.e(p03);
                    if (Build.VERSION.SDK_INT >= 33) {
                        obj3 = p03.getSerializable(".callbackStatus", r.class);
                    } else {
                        Object serializable = p03.getSerializable(".callbackStatus");
                        obj3 = (r) (serializable instanceof r ? serializable : null);
                    }
                    r rVar = (r) obj3;
                    if (e14 != null && rVar == r.OK && (e14 instanceof mp2.h)) {
                        Iterator it4 = eVar.f69029m.iterator();
                        while (it4.hasNext()) {
                            ((mp2.e) it4.next()).d((mp2.h) e14);
                        }
                    }
                } else if (Intrinsics.d("onConnectionLost", string2)) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        obj2 = p03.getSerializable(".exception", Exception.class);
                    } else {
                        Object serializable2 = p03.getSerializable(".exception");
                        obj2 = (Exception) (serializable2 instanceof Exception ? serializable2 : null);
                    }
                    Exception exc = (Exception) obj2;
                    Iterator it5 = eVar.f69029m.iterator();
                    while (it5.hasNext()) {
                        ((mp2.e) it5.next()).a(exc);
                    }
                } else if (Intrinsics.d("disconnect", string2)) {
                    eVar.f69025i = null;
                    mp2.c e15 = eVar.e(p03);
                    if (e15 != null) {
                        ((n) e15).b();
                    }
                    Iterator it6 = eVar.f69029m.iterator();
                    while (it6.hasNext()) {
                        ((mp2.e) it6.next()).a(null);
                    }
                } else if (!Intrinsics.d("trace", string2)) {
                    MqttService mqttService3 = eVar.f69024h;
                    Intrinsics.f(mqttService3);
                    mqttService3.j("Callback action doesn't exist.");
                }
            }
        }
        return Unit.f80348a;
    }
}
