/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTriangleConvexcastCallback extends btTriangleCallback {
  private long swigCPtr;

  protected btTriangleConvexcastCallback(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btTriangleConvexcastCallback_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btTriangleConvexcastCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btTriangleConvexcastCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setM_convexShape(btConvexShape value) {
    gdxBulletJNI.btTriangleConvexcastCallback_m_convexShape_set(swigCPtr, this, btConvexShape.getCPtr(value), value);
  }

  public btConvexShape getM_convexShape() {
    long cPtr = gdxBulletJNI.btTriangleConvexcastCallback_m_convexShape_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexShape(cPtr, false);
  }

  public void setM_convexShapeFrom(btTransform value) {
    gdxBulletJNI.btTriangleConvexcastCallback_m_convexShapeFrom_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getM_convexShapeFrom() {
    long cPtr = gdxBulletJNI.btTriangleConvexcastCallback_m_convexShapeFrom_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setM_convexShapeTo(btTransform value) {
    gdxBulletJNI.btTriangleConvexcastCallback_m_convexShapeTo_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getM_convexShapeTo() {
    long cPtr = gdxBulletJNI.btTriangleConvexcastCallback_m_convexShapeTo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setM_triangleToWorld(btTransform value) {
    gdxBulletJNI.btTriangleConvexcastCallback_m_triangleToWorld_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getM_triangleToWorld() {
    long cPtr = gdxBulletJNI.btTriangleConvexcastCallback_m_triangleToWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setM_hitFraction(float value) {
    gdxBulletJNI.btTriangleConvexcastCallback_m_hitFraction_set(swigCPtr, this, value);
  }

  public float getM_hitFraction() {
    return gdxBulletJNI.btTriangleConvexcastCallback_m_hitFraction_get(swigCPtr, this);
  }

  public void setM_triangleCollisionMargin(float value) {
    gdxBulletJNI.btTriangleConvexcastCallback_m_triangleCollisionMargin_set(swigCPtr, this, value);
  }

  public float getM_triangleCollisionMargin() {
    return gdxBulletJNI.btTriangleConvexcastCallback_m_triangleCollisionMargin_get(swigCPtr, this);
  }

  public void setM_allowedPenetration(float value) {
    gdxBulletJNI.btTriangleConvexcastCallback_m_allowedPenetration_set(swigCPtr, this, value);
  }

  public float getM_allowedPenetration() {
    return gdxBulletJNI.btTriangleConvexcastCallback_m_allowedPenetration_get(swigCPtr, this);
  }

  public float reportHit(Vector3 hitNormalLocal, Vector3 hitPointLocal, float hitFraction, int partId, int triangleIndex) {
    return gdxBulletJNI.btTriangleConvexcastCallback_reportHit(swigCPtr, this, hitNormalLocal, hitPointLocal, hitFraction, partId, triangleIndex);
  }

}
