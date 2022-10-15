#include<iostream>
using namespace std;
class student{
    protected:
      int roll_number;
    public:
       void set_roll_number(int);
       void get_roll_number(void);

};
void student::set_roll_number(int r){
    roll_number=r;

}
void student::get_roll_number(){
    cout<<"roll number is"<<roll_number<<endl;
}
class exam:public student{
    protected:
    float math;
    float physics;
    public :
     void set_marks(float,float);
     void get_marks(void);

};
void exam ::set_marks(float m1, float m2){
    math=m1;
    physics = m2;
    
} 
void exam::get_marks(){
   cout<<"the marks in math is"<<math<<endl; 
    cout<<"the marks in physics is"<<physics<<endl; 

}
class result:public exam{
    float percentage;
    public:
      void display(){
          get_roll_number();
          get_marks();
           
          
        cout<<"your percentage is "<<(math+physics)/2<<endl;

      }
};
int main(){
    result hariom;
    
    hariom.set_roll_number(8);
    hariom.set_marks(34,87);
    hariom.display();
    return 0;

}
