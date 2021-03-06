package com.base.abstraction.interfaces;

/**
 * an interface implemented by Classes that will need to free-up there resources
 * (reference variables) at some point of the flow
 * <p/>
 * Created by Ahmed Adel on 8/30/2016.
 */
public interface Clearable {

  /**
   * clear (null-reference) this Object's reference variables
   */
  void clear();
}
